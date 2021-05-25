package com.designpatterns.iterator.Refactored;

import com.designpatterns.iterator.Refactored.Collections.*;
import com.designpatterns.iterator.Refactored.Iterators.ShoppingListIterator;

import java.util.ArrayList;
import java.util.List;

public class Refactored {
    private static List<String> getShoppingListItems() {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("bread");
        shoppingList.add("cookies");
        shoppingList.add("apples");
        shoppingList.add("carrots");
        shoppingList.add("paper towels");

        return shoppingList;
    };

    private static void printItems(ShoppingListIterator iterator) {
        System.out.println("");
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
    }

    public static void run() {
        // Create the collection
        ShoppingListCollection shoppingListCollection = new SimpleShoppingListCollection(getShoppingListItems());

        // Print items top to bottom
        printItems(shoppingListCollection.createTopToBottomIterator());

        // Print items bottom to top
        printItems(shoppingListCollection.createBottomToTopIterator());
    }
}
