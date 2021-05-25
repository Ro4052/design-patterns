package com.designpatterns.iterator.Refactored.Iterators;

import java.util.List;

public class BottomToTopIterator implements ShoppingListIterator {
    private final List<String> shoppingList;
    private int index;

    public BottomToTopIterator(List<String> shoppingList) {
        this.shoppingList = shoppingList;
        index = shoppingList.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public String getNext() {
        if (!hasNext()) {
            return null;
        }

        String nextItem = shoppingList.get(index);
        index--;

        return nextItem;
    }
}
