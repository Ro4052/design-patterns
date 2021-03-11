package com.designpatterns.adapter.Refactored;

import com.designpatterns.adapter.Refactored.StreamingServices.SpotifyUploadService;
import com.designpatterns.adapter.Refactored.StreamingServices.StreamingService;
import com.designpatterns.adapter.Refactored.StreamingServices.AppleUploadService;
import com.designpatterns.adapter.Refactored.StreamingServices.AppleUploadServiceAdapter;

public class Refactored {
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
        StreamingService appleStreamingService = new AppleUploadServiceAdapter(new AppleUploadService());
        TrackUploader appleTrackUploader = new TrackUploader(appleStreamingService);
        appleTrackUploader.uploadTrack(trackName, audioFilePath, artworkFilePath, lyrics);
    }
}
