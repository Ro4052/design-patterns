package com.designpatterns.adapter.Refactored.StreamingServices;

public class SpotifyUploadService implements StreamingService {
    @Override
    public void uploadAudio(String trackName, String audioFilePath) {
        System.out.println("\nUploading audio to Spotify...");
        System.out.println("Track name: " + trackName);
        System.out.println("File path: " + audioFilePath);
    }

    @Override
    public void uploadArtwork(String trackName, String artworkFilePath) {
        System.out.println("\nUploading artwork to Spotify...");
        System.out.println("Track name: " + trackName);
        System.out.println("File path: " + artworkFilePath);
    }

    @Override
    public void uploadLyrics(String trackName, String lyrics) {
        System.out.println("\nUploading lyrics to Spotify...");
        System.out.println("Track name: " + trackName);
        System.out.println("File path: " + lyrics);
    }

    @Override
    public void releaseTrack(String trackName) {
        System.out.println("\nReleasing track to Spotify...");
        System.out.println("Track name: " + trackName);
    }
}
