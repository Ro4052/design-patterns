package com.designpatterns.facade.Refactored.TrackUploader;

public class UploadService {
    public void upload(String trackName, Audio audio, Artwork artwork, Lyrics lyrics) {
        System.out.println("\nStarting upload for: " + trackName);
        System.out.println("Uploading audio: " + audio.getFileName());
        System.out.println("Uploading artwork: " + artwork.getFileName());
        System.out.println("Uploading lyrics: " + lyrics.getLyrics());
        System.out.println("All artifacts uploaded...");
    }

    public void publish(String trackName) {
        System.out.println("\nPublishing track: " + trackName);
    }
}
