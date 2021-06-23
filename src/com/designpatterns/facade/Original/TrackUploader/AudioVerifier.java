package com.designpatterns.facade.Original.TrackUploader;

public class AudioVerifier {
    public void verify(Audio audio) {
        System.out.println("Verifying audio: " + audio.getFileName());
    }
}
