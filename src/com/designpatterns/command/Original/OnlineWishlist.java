package com.designpatterns.command.Original;

import java.util.ArrayList;

public class OnlineWishlist {
    private ArrayList<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void removeAllItems() {
        items = new ArrayList<>();
    }

    public void undo() {
        System.out.println("Undo not supported...");
    }

    public void printItems() {
        System.out.println("\n<<< Items in wishlist: >>>");
        items.forEach(System.out::println);
    }
}
