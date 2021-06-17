package com.designpatterns.mediator.Original.Components;

import com.designpatterns.mediator.Original.Message;

public class MessageService {
    private final Notifications notifications;
    private final ChatBox chatBox;
    private final SideBar sideBar;

    public MessageService(Notifications notifications, ChatBox chatBox, SideBar sideBar) {
        this.notifications = notifications;
        this.chatBox = chatBox;
        this.sideBar = sideBar;
    }

    public void outgoingMessage(Message message) {
        System.out.println("Sending outgoing message (" + message.getMessage() + ") to server...");
    }

    public void incomingMessage(Message message) {
        System.out.println("\nReceived new incoming message...");
        notifications.showNotification(message);
        chatBox.addNewMessage(message);
        sideBar.updateLatestMessage(message);
    }
}
