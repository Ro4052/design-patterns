package com.designpatterns.adapter.Original.StreamingServices;

public interface StreamingService {
    void uploadAudio(String trackName, String audioFilePath);
    void uploadArtwork(String trackName, String artworkFilePath);
    void uploadLyrics(String trackName, String lyrics);
    void releaseTrack(String trackName);
}
