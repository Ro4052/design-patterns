package com.designpatterns.proxy.Refactored;

public class VideoGame {
    private final String name;
    private final String genre;
    private final String developer;
    private final Integer releaseYear;

    public VideoGame(String name, String genre, String developer, Integer releaseYear) {
        this.name = name;
        this.genre = genre;
        this.developer = developer;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getDeveloper() {
        return developer;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }
}
