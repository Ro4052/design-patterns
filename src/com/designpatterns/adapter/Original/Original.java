package com.designpatterns.adapter.Original;

import com.designpatterns.adapter.Original.StreamingServices.AppleUploadService;
import com.designpatterns.adapter.Original.StreamingServices.SpotifyUploadService;
import com.designpatterns.adapter.Original.StreamingServices.StreamingService;

public class Original {
    public static void run() {
        // Make track
        String trackName = "The best song in the world";
        String audioFilePath = "/path/to/the/best/song/in/the/world/audio.flac";
        String artworkFilePath = "/path/to/the/best/song/in/the/world/artwork.jpeg";
        String lyrics = "These are the best lyrics in the world!";

        // Upload track to Spotify
        StreamingService spotifyStreamingService = new SpotifyUploadService();
        TrackUploader spotifyTrackUploader = new TrackUploader(spotifyStreamingService);
        spotifyTrackUploader.uploadTrack(trackName, audioFilePath, artworkFilePath, lyrics);

        // Upload track to Apple
        AppleUploadService appleStreamingService = new AppleUploadService();
//        TrackUploader appleTrackUploader = new TrackUploader(appleStreamingService);
//        appleTrackUploader.uploadTrack(trackName, audioFilePath, artworkFilePath, lyrics);
        System.out.println("\nApple not compatible!");
    }
}
