package com.designpatterns.facade.Refactored.TrackUploader;

public class LyricsVerifier {
    public void verify(Lyrics lyrics) {
        System.out.println("\nVerifying lyrics: " + lyrics.getLyrics());
    }
}
