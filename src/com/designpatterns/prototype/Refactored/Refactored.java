package com.designpatterns.prototype.Refactored;

import com.designpatterns.prototype.Refactored.Cats.*;

public class Refactored {
    public static void run() {
        // Create some "public" cats
        System.out.println("\n- Public cats -");
        CloneableCat publicCat1 = new PublicCat("ginger", 2);
        CloneableCat publicCat2 = new PublicCat("black", 7);

        System.out.println("\nCat 1:");
        publicCat1.speak();
        publicCat1.nap();

        System.out.println("Cat 2:");
        publicCat2.speak();
        publicCat2.nap();

        // Clone the "public" cats
        System.out.println("\n- Public cat clones -");
        CloneableCat publicCat1Clone = publicCat1.clone();
        CloneableCat publicCat2Clone = publicCat2.clone();

        System.out.println("\nCat 1 clone:");
        publicCat1Clone.speak();
        publicCat1Clone.nap();

        System.out.println("Cat 2 clone:");
        publicCat2Clone.speak();
        publicCat2Clone.nap();

        // Create some "private" cats
        System.out.println("\n- Private cats -");
        CloneableCat privateCat1 = new PrivateCat("ginger", 2);
        CloneableCat privateCat2 = new PrivateCat("black", 7);

        System.out.println("\nCat 1:");
        privateCat1.speak();
        privateCat1.nap();

        System.out.println("Cat 2:");
        privateCat2.speak();
        privateCat2.nap();

        // Clone the "private" cats
        System.out.println("\n- Private cat clones -");
        CloneableCat privateCat1Clone = privateCat1.clone();
        CloneableCat privateCat2Clone = privateCat2.clone();

        System.out.println("\nCat 1:");
        privateCat1Clone.speak();
        privateCat1Clone.nap();

        System.out.println("Cat 2:");
        privateCat2Clone.speak();
        privateCat2Clone.nap();
    }
}
