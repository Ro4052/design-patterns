package com.designpatterns.facade.Original;

import com.designpatterns.facade.Original.TrackUploader.*;

public class Original {
    public static void run() {
        // Setup track properties
        String trackName = "The best song in the world";
        String audioFilePath = "/path/to/the/best/song/in/the/world/audio.flac";
        String artworkFilePath = "/path/to/the/best/song/in/the/world/artwork.jpeg";
        String rawLyrics = "These are the best lyrics in the world!";

        // Publish track
        // Load and verify audio
        Audio audio = new Audio(audioFilePath);
        AudioVerifier audioVerifier = new AudioVerifier();
        audioVerifier.verify(audio);

        // Load and verify artwork
        Artwork artwork = new Artwork(artworkFilePath);
        ArtworkVerifier artworkVerifier = new ArtworkVerifier();
        artworkVerifier.verify(artwork);

        // Load and verify lyrics
        Lyrics lyrics = new Lyrics(rawLyrics);
        LyricsVerifier lyricsVerifier = new LyricsVerifier();
        lyricsVerifier.verify(lyrics);

        // Upload artifacts and publish track
        UploadService uploadService = new UploadService();
        uploadService.upload(trackName, audio, artwork, lyrics);
        uploadService.publish(trackName);
    }
}
