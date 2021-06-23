package com.designpatterns.facade.Refactored;

import com.designpatterns.facade.Refactored.TrackUploader.*;

public class TrackUploaderFacade {
    public void uploadTrack(String trackName, String pathToAudio, String pathToArtwork, String rawLyrics) {
        // Load and verify audio
        Audio audio = new Audio(pathToAudio);
        AudioVerifier audioVerifier = new AudioVerifier();
        audioVerifier.verify(audio);

        // Load and verify artwork
        Artwork artwork = new Artwork(pathToArtwork);
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
