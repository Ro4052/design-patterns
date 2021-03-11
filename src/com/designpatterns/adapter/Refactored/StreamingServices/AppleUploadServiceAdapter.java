package com.designpatterns.adapter.Refactored.StreamingServices;

public class AppleUploadServiceAdapter implements StreamingService {
    private AppleUploadService appleUploadService;

    public AppleUploadServiceAdapter(AppleUploadService appleUploadService) {
        this.appleUploadService = appleUploadService;
    }

    @Override
    public void uploadAudio(String trackName, String audioFilePath) {
        appleUploadService.addAudio(trackName, audioFilePath);
    }

    @Override
    public void uploadArtwork(String trackName, String artworkFilePath) {
        appleUploadService.addArtwork(trackName, artworkFilePath);
    }

    @Override
    public void uploadLyrics(String trackName, String lyrics) {
        appleUploadService.addLyrics(trackName, lyrics);
    }

    @Override
    public void releaseTrack(String trackName) {
        appleUploadService.publishTrack(trackName);
    }
}
