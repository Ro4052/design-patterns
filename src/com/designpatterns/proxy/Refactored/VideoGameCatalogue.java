package com.designpatterns.proxy.Refactored;

import java.util.List;
import java.util.Optional;

public interface VideoGameCatalogue {
    List<String> getAllGameTitles();
    Optional<VideoGame> getGame(String name);
}
