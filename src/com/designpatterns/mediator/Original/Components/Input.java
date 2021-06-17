package com.designpatterns.mediator.Original.Components;

import com.designpatterns.mediator.Original.Message;

public class Input {
    private final MessageService messageService;
    private final ChatBox chatBox;
    private final SideBar sideBar;

    public Input(MessageService messageService, ChatBox chatBox, SideBar sideBar) {
        this.messageService = messageService;
        this.chatBox = chatBox;
        this.sideBar = sideBar;
    }

    public void typeMessage(String messageText) {
        System.out.println("\nTyping and sending message...");
        Message message = new Message("Me", messageText);
        messageService.outgoingMessage(message);
        chatBox.addNewMessage(message);
        sideBar.updateLatestMessage(message);
    }
}
