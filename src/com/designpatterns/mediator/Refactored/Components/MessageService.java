package com.designpatterns.mediator.Refactored.Components;

import com.designpatterns.mediator.Refactored.Mediators.Mediator;
import com.designpatterns.mediator.Refactored.Message;

public class MessageService implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "messageservice";
    }

    public void outgoingMessage(Message message) {
        System.out.println("Sending outgoing message (" + message.getMessage() + ") to server...");
    }

    public void incomingMessage(Message message) {
        System.out.println("\nReceived new incoming message...");
        this.mediator.receiveMessage(this, message);
    }
}
