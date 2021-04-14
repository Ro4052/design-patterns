package com.designpatterns.adapter.Original;

import com.designpatterns.adapter.Original.StreamingServices.StreamingService;

public class TrackUploader {
    private final StreamingService streamingService;

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
