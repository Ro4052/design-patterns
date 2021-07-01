package com.designpatterns.memento.Refactored.Browser;

import com.designpatterns.memento.Refactored.Caretaker.Memento;

public class BrowserMemento implements Memento {
    private final Browser browser;
    private final String pageProtocol;
    private final String pageBaseURL;
    private final String path;

    public BrowserMemento(Browser browser, String pageProtocol, String pageBaseURL, String path) {
        this.browser = browser;
        this.pageProtocol = pageProtocol;
        this.pageBaseURL = pageBaseURL;
        this.path = path;
    }

    @Override
    public void restore() {
        browser.setState(pageProtocol, pageBaseURL, path);
    }
}
