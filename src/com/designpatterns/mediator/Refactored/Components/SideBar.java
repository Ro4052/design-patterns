package com.designpatterns.mediator.Refactored.Components;

import com.designpatterns.mediator.Refactored.Mediators.Mediator;
import com.designpatterns.mediator.Refactored.Message;

public class SideBar implements Component {
    private String sideBarText;

    @Override
    public void setMediator(Mediator mediator) { }

    @Override
    public String getName() {
        return "sidebar";
    }

    public void updateLatestMessage(Message message) {
        System.out.println("Updating side bar...");
        sideBarText = message.getSender() + ": " + message.getMessage();
    }

    public String getSidebarText() {
        return sideBarText;
    }
}
