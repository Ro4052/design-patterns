package com.designpatterns.facade.Original.TrackUploader;

public class LyricsVerifier {
    public void verify(Lyrics lyrics) {
        System.out.println("\nVerifying lyrics: " + lyrics.getLyrics());
    }
}
