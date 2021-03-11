package com.designpatterns.adapter.Refactored.StreamingServices;

public class AppleUploadService {
    public void addAudio(String trackName, String audioFilePath) {
        System.out.println("\nAdding audio to Apple Store...");
        System.out.println("Track name: " + trackName);
        System.out.println("File path: " + audioFilePath);
    }

    public void addArtwork(String trackName, String artworkFilePath) {
        System.out.println("\nAdding artwork to Apple Store...");
        System.out.println("Track name: " + trackName);
        System.out.println("File path: " + artworkFilePath);
    }

    public void addLyrics(String trackName, String lyrics) {
        System.out.println("\nAdding lyrics to Apple Store...");
        System.out.println("Track name: " + trackName);
        System.out.println("File path: " + lyrics);
    }

    public void publishTrack(String trackName) {
        System.out.println("\nPublishing track to Apple Store...");
        System.out.println("Track name: " + trackName);
    }
}
