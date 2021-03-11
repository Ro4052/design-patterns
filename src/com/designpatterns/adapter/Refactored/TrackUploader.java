package com.designpatterns.adapter.Refactored;

import com.designpatterns.adapter.Refactored.StreamingServices.StreamingService;

public class TrackUploader {
    private StreamingService streamingService;

    public TrackUploader(StreamingService streamingService) {
        this.streamingService = streamingService;
    }

    public void uploadTrack(String name, String audioFilePath, String artworkFilePath, String lyrics) {
        this.streamingService.uploadAudio(name, audioFilePath);
        this.streamingService.uploadArtwork(name, artworkFilePath);
        this.streamingService.uploadLyrics(name, lyrics);
        this.streamingService.releaseTrack(name);
    }
}
