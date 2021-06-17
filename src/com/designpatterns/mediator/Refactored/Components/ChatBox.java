package com.designpatterns.mediator.Refactored.Components;

import com.designpatterns.mediator.Refactored.Mediators.Mediator;
import com.designpatterns.mediator.Refactored.Message;

import java.util.ArrayList;
import java.util.List;

public class ChatBox implements Component {
    private final List<Message> messages = new ArrayList<>();

    @Override
    public void setMediator(Mediator mediator) { }

    @Override
    public String getName() {
        return "chatbox";
    }

    public void addNewMessage(Message message) {
        System.out.println("Adding new message to chat box...");
        messages.add(message);
    }

    public List<Message> getAllMessages() {
        return messages;
    }
}
