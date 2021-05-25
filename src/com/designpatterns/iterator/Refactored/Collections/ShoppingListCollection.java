package com.designpatterns.iterator.Refactored.Collections;

import com.designpatterns.iterator.Refactored.Iterators.ShoppingListIterator;

public interface ShoppingListCollection {
    ShoppingListIterator createTopToBottomIterator();
    ShoppingListIterator createBottomToTopIterator();
}
