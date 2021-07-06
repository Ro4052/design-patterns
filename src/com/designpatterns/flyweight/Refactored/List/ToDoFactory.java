package com.designpatterns.flyweight.Refactored.List;

import com.designpatterns.flyweight.Refactored.Items.UserToDo;

import java.util.HashMap;
import java.util.Map;

public class ToDoFactory {
    static Map<String, UserToDo> userToDos = new HashMap<>();

    public static UserToDo getUserToDo(String username, String avatarPath) {
        UserToDo userToDo = userToDos.get(username);
        if (userToDo == null) {
            userToDo = new UserToDo(username, avatarPath);
            userToDos.put(username, userToDo);
        }

        return userToDo;
    }
}
