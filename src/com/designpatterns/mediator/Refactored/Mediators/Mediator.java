package com.designpatterns.mediator.Refactored.Mediators;

import com.designpatterns.mediator.Refactored.Components.Component;
import com.designpatterns.mediator.Refactored.Message;

public interface Mediator {
    void registerComponent(Component component);
    void sendMessage(Component component, String messageText);
    void receiveMessage(Component component, Message message);
}
