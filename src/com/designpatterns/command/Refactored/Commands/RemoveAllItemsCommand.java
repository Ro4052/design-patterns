package com.designpatterns.command.Refactored.Commands;

import com.designpatterns.command.Refactored.OnlineWishlist;

import java.util.ArrayList;

public class RemoveAllItemsCommand extends OnlineWishlistCommand {
    public RemoveAllItemsCommand(OnlineWishlist wishlist) {
        super(wishlist);
    }

    @Override
    public void execute() {
        wishlist.setItems(new ArrayList<>());
    }
}
