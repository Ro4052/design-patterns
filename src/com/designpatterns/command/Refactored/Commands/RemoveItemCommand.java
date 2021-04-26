package com.designpatterns.command.Refactored.Commands;

import com.designpatterns.command.Refactored.OnlineWishlist;

import java.util.ArrayList;

public class RemoveItemCommand extends OnlineWishlistCommand {
    private final String item;

    public RemoveItemCommand(OnlineWishlist wishlist, String item) {
        super(wishlist);
        this.item = item;
    }

    @Override
    public void execute() {
        ArrayList<String> items = wishlist.getItems();
        items.remove(item);
        wishlist.setItems(items);
    }
}
