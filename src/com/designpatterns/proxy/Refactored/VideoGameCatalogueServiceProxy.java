package com.designpatterns.proxy.Refactored;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class VideoGameCatalogueServiceProxy implements VideoGameCatalogue {
    private final VideoGameCatalogueService gameService;
    private List<String> catalogueCache;
    private final HashMap<String, Optional<VideoGame>> gameCache = new HashMap<>();

    public VideoGameCatalogueServiceProxy() {
        gameService = new VideoGameCatalogueService();
    }

    @Override
    public List<String> getAllGameTitles() {
        if (catalogueCache != null) {
            System.out.println("\nReturning cached catalogue...");
            return catalogueCache;
        }

        catalogueCache = gameService.getAllGameTitles();
        return catalogueCache;
    }

    @Override
    public Optional<VideoGame> getGame(String name) {
        Optional<VideoGame> gameFromCache = gameCache.get(name);
        if (gameFromCache != null && gameFromCache.isPresent()) {
            System.out.println("\nReturning cached game...");
            return gameFromCache;
        }

        Optional<VideoGame> gameFromServer = gameService.getGame(name);
        gameCache.put(name, gameFromServer);
        return gameFromServer;
    }
}
