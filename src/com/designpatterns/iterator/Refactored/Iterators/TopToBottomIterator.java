package com.designpatterns.iterator.Refactored.Iterators;

import java.util.List;

public class TopToBottomIterator implements ShoppingListIterator {
    private final List<String> shoppingList;
    private int index = 0;

    public TopToBottomIterator(List<String> shoppingList) {
        this.shoppingList = shoppingList;
    }

    @Override
    public boolean hasNext() {
        return index < shoppingList.size();
    }

    @Override
    public String getNext() {
        if (!hasNext()) {
            return null;
        }

        String nextItem = shoppingList.get(index);
        index++;

        return nextItem;
    }
}
