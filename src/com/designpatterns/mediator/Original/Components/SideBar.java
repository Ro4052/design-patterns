package com.designpatterns.mediator.Original.Components;

import com.designpatterns.mediator.Original.Message;

public class SideBar {
    private String sideBarText;

    public void updateLatestMessage(Message message) {
        System.out.println("Updating side bar...");
        sideBarText = message.getSender() + ": " + message.getMessage();
    }

    public String getSidebarText() {
        return sideBarText;
    }
}
