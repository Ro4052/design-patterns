package com.designpatterns.iterator.Original;

import java.util.ArrayList;
import java.util.List;

public class Original {
    private static List<String> getShoppingListItems() {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("bread");
        shoppingList.add("cookies");
        shoppingList.add("apples");
        shoppingList.add("carrots");
        shoppingList.add("paper towels");

        return shoppingList;
    };

    private static void printItems(List<String> shoppingList, boolean reverse) {
        System.out.println("");
        int index = reverse ? shoppingList.size() - 1 : 0;
        while (index >= 0 && index < shoppingList.size()) {
            System.out.println(shoppingList.get(index));
            index = reverse ? index - 1 : index + 1;
        }
    }

    public static void run() {
        // Create the shopping list
        List<String> shoppingList = getShoppingListItems();

        // Print items top to bottom
        printItems(shoppingList, false);

        // Print items bottom to top
        printItems(shoppingList, true);
    }
}
