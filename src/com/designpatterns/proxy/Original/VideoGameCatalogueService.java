package com.designpatterns.proxy.Original;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class VideoGameCatalogueService implements VideoGameCatalogue {
    private final List<VideoGame> videoGames = new ArrayList<>();

    public VideoGameCatalogueService() {
        videoGames.add(new VideoGame(
                "Assassin's Creed",
                "Action - Stealth",
                "Ubisoft Montreal",
                2007
        ));
        videoGames.add(new VideoGame(
                "Just Cause",
                "Action",
                "Avalanche Studios",
                2006
        ));
        videoGames.add(new VideoGame(
                "Project CARS",
                "Racing",
                "Slightly Mad Studios",
                2015
        ));
        videoGames.add(new VideoGame(
                "Horizon Zero Dawn",
                "RPG",
                "Guerrilla Games",
                2017
        ));
        videoGames.add(new VideoGame(
                "The Elder Scrolls V: Skyrim",
                "RPG",
                "Bethesda Game Studios",
                2011
        ));
    }

    public List<String> getAllGameTitles() {
        System.out.println("\nGetting game titles from server...");
        return videoGames
                .stream()
                .map(VideoGame::getName)
                .collect(Collectors.toList());
    }

    public Optional<VideoGame> getGame(String name) {
        System.out.println("\nGetting game from server...");
        return videoGames
                .stream()
                .filter(game -> game.getName().equals(name))
                .findFirst();
    }
}
