package com.designpatterns.flyweight.Refactored.List;

import com.designpatterns.flyweight.Refactored.Items.*;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private final List<ToDoItem> todos = new ArrayList<>();

    private String getAvatarPathForUser(String username) {
        switch (username) {
            case "john" -> {
                return "/avatars/john.png";
            }
            case "sarah" -> {
                return "/avatars/sarah.png";
            }
            case "brian" -> {
                return "/avatars/brian.png";
            }
            case "alice" -> {
                return "/avatars/alice.png";
            }
            default -> {
                return "/avatars/default.png";
            }
        }
    }

    public void addToDo(String text, String username) {
        UserToDo userToDo = ToDoFactory.getUserToDo(username, getAvatarPathForUser(username));
        ToDoItem todo = new ToDoItem(text, userToDo);
        todos.add(todo);
    }

    public void updateToDoText(Integer index, String text) {
        todos.get(index).setText(text);
    }

    public void toggleToDoCompleted(Integer index) {
        todos.get(index).toggleCompleted();
    }

    public void renderAllItems() {
        todos.forEach(ToDoItem::render);
    }
}
