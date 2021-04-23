package com.designpatterns.proxy.Original;

import java.util.List;
import java.util.Optional;

public class Original {
    private static void printGameNames(List<String> gameNames) {
        System.out.println("<< Game Names >>");
        gameNames.forEach(System.out::println);
    }

    private static void printGame(Optional<VideoGame> maybeGame) {
        if (maybeGame.isEmpty()) return;

        VideoGame game = maybeGame.get();
        System.out.println("<< Game Details >>");
        System.out.println("Name: " + game.getName());
        System.out.println("Genre: " + game.getGenre());
        System.out.println("Developer: " + game.getDeveloper());
        System.out.println("Release year: " + game.getReleaseYear());
    }

    public static void run() {
        // Create video game catalogue service proxy
        VideoGameCatalogue videoGameCatalogue = new VideoGameCatalogueService();

        // Interact with the service
        printGameNames(videoGameCatalogue.getAllGameTitles());
        printGame(videoGameCatalogue.getGame("Project CARS"));
        printGame(videoGameCatalogue.getGame("Horizon Zero Dawn"));
        printGameNames(videoGameCatalogue.getAllGameTitles());
        printGame(videoGameCatalogue.getGame("Project CARS"));
    }
}
