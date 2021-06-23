package com.designpatterns.facade.Refactored.TrackUploader;

public class Lyrics {
    private final String lyrics;

    public Lyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getLyrics() {
        return lyrics;
    }
}
