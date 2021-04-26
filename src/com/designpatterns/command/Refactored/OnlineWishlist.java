package com.designpatterns.command.Refactored;

import com.designpatterns.command.Refactored.Commands.*;

import java.util.ArrayList;
import java.util.Stack;

public class OnlineWishlist {
    private ArrayList<String> items = new ArrayList<>();
    private final Stack<OnlineWishlistCommand> commandHistory = new Stack<>();

    private void executeCommand(OnlineWishlistCommand command) {
        command.execute();
        commandHistory.push(command);
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void addItem(String item) {
        executeCommand(new AddItemCommand(this, item));
    }

    public void removeItem(String item) {
        executeCommand(new RemoveItemCommand(this, item));
    }

    public void removeAllItems() {
        executeCommand(new RemoveAllItemsCommand(this));
    }

    public void undo() {
        OnlineWishlistCommand lastCommand = commandHistory.pop();
        lastCommand.undo();
    }

    public void printItems() {
        System.out.println("\n<<< Items in wishlist: >>>");
        items.forEach(System.out::println);
    }
}
