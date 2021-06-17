package com.designpatterns.mediator.Original.Components;

import com.designpatterns.mediator.Original.Message;

public class Notifications {
    public void showNotification(Message message) {
        System.out.println("Notification: New message from " + message.getSender() + "!");
    }
}
