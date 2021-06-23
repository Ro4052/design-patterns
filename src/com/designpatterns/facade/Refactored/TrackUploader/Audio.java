package com.designpatterns.facade.Refactored.TrackUploader;

public class Audio {
    private final String fileName;

    public Audio(String path) {
        System.out.println("\nExtracting audio from " + path + "...");
        String[] pathParts = path.split("/");
        fileName = pathParts[pathParts.length - 1];
    }

    public String getFileName() {
        return fileName;
    }
}
