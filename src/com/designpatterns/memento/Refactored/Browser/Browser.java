package com.designpatterns.memento.Refactored.Browser;

import com.designpatterns.memento.Refactored.Caretaker.*;

public class Browser implements Originator {
    private String pageProtocol;
    private String pageBaseURL;
    private String path;
    private final Caretaker history = new Caretaker();

    public void goToPage(String URL) {
        System.out.println("Navigating to page: " + URL);
        String[] protocolSplit = URL.split("://");
        String[] pathSplit = protocolSplit[1].split("/", 2);
        pageProtocol = protocolSplit[0];
        pageBaseURL = pathSplit[0];
        path = "/" + (pathSplit.length > 1 ? pathSplit[1] : "");
        history.push(this);
    }

    public void printCurrentURL() {
        String URL = pageProtocol + "://" + pageBaseURL + path;
        System.out.println("Current URL: " + URL);
    }

    @Override
    public Memento save() {
        return new BrowserMemento(this, pageProtocol, pageBaseURL, path);
    }

    public void setState(String pageProtocol, String pageBaseURL, String path) {
        this.pageProtocol = pageProtocol;
        this.pageBaseURL = pageBaseURL;
        this.path = path;
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
