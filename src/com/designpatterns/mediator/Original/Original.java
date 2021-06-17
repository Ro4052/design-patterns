package com.designpatterns.mediator.Original;

import com.designpatterns.mediator.Original.Components.*;

public class Original {
    public static void run() {
        // Create and the components
        ChatBox chatBox = new ChatBox();
        Notifications notifications = new Notifications();
        SideBar sideBar = new SideBar();
        MessageService messageService = new MessageService(notifications, chatBox, sideBar);
        Input input = new Input(messageService, chatBox, sideBar);

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
