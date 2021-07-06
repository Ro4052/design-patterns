package com.designpatterns.flyweight.Original;

import com.designpatterns.flyweight.Original.ToDoList.ToDoList;

public class Original {
    public static void run() {
        System.out.println();

        // Make the list
        ToDoList todoList = new ToDoList();

        // Use the list
        todoList.addToDo("Make lunch", "john");
        todoList.addToDo("Eat lunch", "john");
        todoList.addToDo("Go to bank", "sarah");

        todoList.toggleToDoCompleted(0);

        todoList.addToDo("Watch TV", "sarah");

        todoList.toggleToDoCompleted(1);
        todoList.updateToDoText(2, "Take cheque to bank");

        todoList.addToDo("Find out who made this list", "brian");
        todoList.addToDo("Bug Brian to find out who made this list", "alice");

        // Render the items
        todoList.renderAllItems();
    }
}
