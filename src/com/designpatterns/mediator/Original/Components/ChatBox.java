package com.designpatterns.mediator.Original.Components;

import com.designpatterns.mediator.Original.Message;

import java.util.ArrayList;
import java.util.List;

public class ChatBox {
    private final List<Message> messages = new ArrayList<>();

    public void addNewMessage(Message message) {
        System.out.println("Adding new message to chat box...");
        messages.add(message);
    }

    public List<Message> getAllMessages() {
        return messages;
    }
}
