package com.designpatterns.flyweight.Refactored.Items;

public class Avatar {
    private final String avatarPath;

    public Avatar(String avatarPath) {
        System.out.println("Loading avatar: " + avatarPath);
        this.avatarPath = avatarPath;
    }

    public void render() {
        System.out.println("Rendering avatar: " + avatarPath);
    }
}
