package com.designpatterns.mediator.Refactored.Mediators;

import com.designpatterns.mediator.Refactored.Components.*;
import com.designpatterns.mediator.Refactored.Message;

public class ChatMediator implements Mediator {
    private ChatBox chatBox;
    private MessageService messageService;
    private Notifications notifications;
    private SideBar sideBar;


    @Override
    public void registerComponent(Component component) {
        component.setMediator(this);
        switch(component.getName()) {
            case "chatbox": {
                chatBox = (ChatBox) component;
                break;
            }
            case "messageservice": {
                messageService = (MessageService) component;
                break;
            }
            case "notifications": {
                assert component instanceof Notifications;
                notifications = (Notifications) component;
                break;
            }
            case "sidebar": {
                assert component instanceof SideBar;
                sideBar = (SideBar) component;
                break;
            }
        }
    }

    @Override
    public void sendMessage(Component component, String messageText) {
        if (component.getName().equals("input")) {
            Message message = new Message("Me", messageText);
            messageService.outgoingMessage(message);
            chatBox.addNewMessage(message);
            sideBar.updateLatestMessage(message);
        }
    }

    @Override
    public void receiveMessage(Component component, Message message) {
        if (component.getName().equals("messageservice")) {
            notifications.showNotification(message);
            chatBox.addNewMessage(message);
            sideBar.updateLatestMessage(message);
        }
    }
}
