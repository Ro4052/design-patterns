package com.designpatterns.proxy.Original;

import java.util.List;
import java.util.Optional;

public interface VideoGameCatalogue {
    List<String> getAllGameTitles();
    Optional<VideoGame> getGame(String name);
}
