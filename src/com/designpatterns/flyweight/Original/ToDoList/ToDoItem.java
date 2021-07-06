package com.designpatterns.flyweight.Original.ToDoList;

public class ToDoItem {
    private String text;
    private Boolean completed = false;
    private final String username;
    private final Avatar avatar;

    public ToDoItem(String text, String username, String avatarPath) {
        this.text = text;
        this.username = username;
        this.avatar = new Avatar(avatarPath);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void toggleCompleted() {
        completed = !completed;
    }

    public void render() {
        System.out.println("\nRendering To Do...");
        System.out.println("Username: " + username);
        System.out.println("Text: " + text);
        System.out.println("Completed: " + (completed ? "Yes" : "No"));
        avatar.render();
    }
}
