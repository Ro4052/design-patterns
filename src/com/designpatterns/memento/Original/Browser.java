package com.designpatterns.memento.Original;

public class Browser {
    public String pageProtocol;
    public String pageBaseURL;
    public String path;
    private final BrowserHistory history;

    public Browser() {
        history = new BrowserHistory(this);
    }

    public void goToPage(String URL) {
        System.out.println("Navigating to page: " + URL);
        String[] protocolSplit = URL.split("://");
        String[] pathSplit = protocolSplit[1].split("/", 2);
        pageProtocol = protocolSplit[0];
        pageBaseURL = pathSplit[0];
        path = "/" + (pathSplit.length > 1 ? pathSplit[1] : "");
        history.push();
    }

    public void printCurrentURL() {
        String URL = pageProtocol + "://" + pageBaseURL + path;
        System.out.println("Current URL: " + URL);
    }

    public void back() {
        System.out.println("Back button clicked...");
        history.undo();
    }

    public void forward() {
        System.out.println("Forward button clicked...");
        history.redo();
    }
}
