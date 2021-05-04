package com.designpatterns.prototype.Original;

import com.designpatterns.prototype.Original.Cats.*;

public class Original {
    private static PublicCat clonePublicCat(PublicCat cat) {
        return new PublicCat(cat.colour, cat.age);
    }

    public static void run() {
        // Create some "public" cats
        System.out.println("\n- Public cats -");
        PublicCat publicCat1 = new PublicCat("ginger", 2);
        PublicCat publicCat2 = new PublicCat("black", 7);

        System.out.println("\nCat 1:");
        publicCat1.speak();
        publicCat1.nap();

        System.out.println("Cat 2:");
        publicCat2.speak();
        publicCat2.nap();

        // Clone the "public" cats
        System.out.println("\n- Public cat clones -");
        PublicCat publicCat1Clone = clonePublicCat(publicCat1);
        PublicCat publicCat2Clone = clonePublicCat(publicCat2);

        System.out.println("\nCat 1 clone:");
        publicCat1Clone.speak();
        publicCat1Clone.nap();

        System.out.println("Cat 2 clone:");
        publicCat2Clone.speak();
        publicCat2Clone.nap();

        // Create some "private" cats
        System.out.println("\n- Private cats -");
        PrivateCat privateCat1 = new PrivateCat("ginger", 2);
        PrivateCat privateCat2 = new PrivateCat("black", 7);

        System.out.println("\nCat 1:");
        privateCat1.speak();
        privateCat1.nap();

        System.out.println("Cat 2:");
        privateCat2.speak();
        privateCat2.nap();

        // Clone the "private" cats
        System.out.println("\n- Private cat clones -");
        System.out.println("We can't clone private cats!");
    }
}
