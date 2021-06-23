package com.designpatterns.facade.Original.TrackUploader;

public class ArtworkVerifier {
    public void verify(Artwork artwork) {
        System.out.println("Verifying artwork: " + artwork.getFileName());
    }
}
