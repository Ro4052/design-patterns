package com.designpatterns.command.Refactored.Commands;

import com.designpatterns.command.Refactored.OnlineWishlist;

import java.util.ArrayList;

abstract public class OnlineWishlistCommand {
    protected final OnlineWishlist wishlist;
    private final ArrayList<String> backupItems;

    public OnlineWishlistCommand(OnlineWishlist wishlist) {
        this.wishlist = wishlist;
        backupItems = new ArrayList<>(wishlist.getItems());
    }

    public final void undo() {
        this.wishlist.setItems(backupItems);
    }

    abstract public void execute();
}
