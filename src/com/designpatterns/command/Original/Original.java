package com.designpatterns.command.Original;

public class Original {
    public static void run() {
        System.out.println();

        // Create a wishlist
        OnlineWishlist wishlist = new OnlineWishlist();

        // Add some items
        wishlist.addItem("Camera");
        wishlist.addItem("PS5");
        wishlist.addItem("Coffee");
        wishlist.addItem("Running shoes");

        // Remove item
        wishlist.removeItem("Coffee");

        // Undo last two operations
        wishlist.undo();
        wishlist.undo();

        // Remove all items
        wishlist.removeAllItems();

        // Undo remove all
        wishlist.undo();

        // Add one more item
        wishlist.addItem("Teapot");

        // Print list
        wishlist.printItems();
    }
}
