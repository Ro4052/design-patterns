package com.designpatterns.mediator.Refactored.Components;

import com.designpatterns.mediator.Refactored.Mediators.Mediator;
import com.designpatterns.mediator.Refactored.Message;

public class Notifications implements Component {
    @Override
    public void setMediator(Mediator mediator) { }

    @Override
    public String getName() {
        return "notifications";
    }

    public void showNotification(Message message) {
        System.out.println("Notification: New message from " + message.getSender() + "!");
    }
}
