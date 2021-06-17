package com.designpatterns.mediator.Refactored;

import com.designpatterns.mediator.Refactored.Components.*;
import com.designpatterns.mediator.Refactored.Mediators.*;

public class Refactored {
    public static void run() {
        // Create the mediator
        Mediator chatMediator = new ChatMediator();

        // Create and register the components
        ChatBox chatBox = new ChatBox();
        Input input = new Input();
        MessageService messageService = new MessageService();
        SideBar sideBar = new SideBar();

        chatMediator.registerComponent(chatBox);
        chatMediator.registerComponent(input);
        chatMediator.registerComponent(messageService);
        chatMediator.registerComponent(new Notifications());
        chatMediator.registerComponent(sideBar);

        // Send some messages
        input.typeMessage("Hello");
        messageService.incomingMessage(new Message("Bob", "Hi!"));
        input.typeMessage("I love this chat!");
        messageService.incomingMessage(new Message("Bob", "Me too!"));
        input.typeMessage("Got to go, talk later!");
        messageService.incomingMessage(new Message("Bob", "Speak to you later :)"));

        // Final chat box and sidebar states
        System.out.println("\nAll messages:");
        chatBox.getAllMessages().forEach(message -> {
            System.out.println(message.getSender() + ": " + message.getMessage());
        });

        System.out.println("\nSidebar message:");
        System.out.println(sideBar.getSidebarText());
    }
}
