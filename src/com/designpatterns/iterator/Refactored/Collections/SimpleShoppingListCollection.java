package com.designpatterns.iterator.Refactored.Collections;

import com.designpatterns.iterator.Refactored.Iterators.*;

import java.util.List;

public class SimpleShoppingListCollection implements ShoppingListCollection {
    private final List<String> shoppingList;

    public SimpleShoppingListCollection(List<String> shoppingList) {
        this.shoppingList = shoppingList;
    }

    @Override
    public ShoppingListIterator createTopToBottomIterator() {
        return new TopToBottomIterator(shoppingList);
    }

    @Override
    public ShoppingListIterator createBottomToTopIterator() {
        return new BottomToTopIterator(shoppingList);
    }
}
