package com.designpatterns.flyweight.Refactored.Items;

public class ToDoItem {
    private String text;
    private Boolean completed = false;
    private final UserToDo userToDo;

    public ToDoItem(String text, UserToDo userToDo) {
        this.text = text;
        this.userToDo = userToDo;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void toggleCompleted() {
        completed = !completed;
    }

    public void render() {
        userToDo.render(text, completed);
    }
}
