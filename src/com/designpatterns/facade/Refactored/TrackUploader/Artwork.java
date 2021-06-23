package com.designpatterns.facade.Refactored.TrackUploader;

public class Artwork {
    private final String fileName;

    public Artwork(String path) {
        System.out.println("\nExtracting audio from " + path + "...");
        String[] pathParts = path.split("/");
        fileName = pathParts[pathParts.length - 1];
    }

    public String getFileName() {
        return fileName;
    }
}
