package com.designpatterns.facade.Refactored;

public class Refactored {
    public static void run() {
        // Setup track properties
        String trackName = "The best song in the world";
        String audioFilePath = "/path/to/the/best/song/in/the/world/audio.flac";
        String artworkFilePath = "/path/to/the/best/song/in/the/world/artwork.jpeg";
        String lyrics = "These are the best lyrics in the world!";

        // Publish track
        TrackUploaderFacade trackUploaderFacade = new TrackUploaderFacade();
        trackUploaderFacade.uploadTrack(trackName, audioFilePath, artworkFilePath, lyrics);
    }
}
