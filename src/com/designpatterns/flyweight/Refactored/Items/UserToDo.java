package com.designpatterns.flyweight.Refactored.Items;

public class UserToDo {
    private final String username;
    private final Avatar avatar;

    public UserToDo(String username, String avatarPath) {
        this.username = username;
        this.avatar = new Avatar(avatarPath);
    }

    public void render(String text, Boolean completed) {
        System.out.println("\nRendering To Do...");
        System.out.println("Username: " + username);
        System.out.println("Text: " + text);
        System.out.println("Completed: " + (completed ? "Yes" : "No"));
        avatar.render();
    }
}
