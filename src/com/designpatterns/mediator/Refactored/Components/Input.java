package com.designpatterns.mediator.Refactored.Components;

import com.designpatterns.mediator.Refactored.Mediators.Mediator;

public class Input implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "input";
    }

    public void typeMessage(String messageText) {
        System.out.println("\nTyping and sending message...");
        mediator.sendMessage(this, messageText);
    }
}
