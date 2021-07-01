package com.designpatterns.memento.Original;

import com.designpatterns.memento.Refactored.Caretaker.Memento;

import java.util.Stack;

public class BrowserHistory {
    private final Browser browser;
    private final Stack<Snapshot> history = new Stack<>();
    private final Stack<Snapshot> forwardHistory = new Stack<>();

    public BrowserHistory(Browser browser) {
        this.browser = browser;
    }

    public void push() {
        history.push(new Snapshot(browser));
        forwardHistory.clear();
    }

    public void undo() {
        if (history.size() < 2) {
            return;
        }

        Snapshot current = history.pop();
        Snapshot previous = history.pop();

        browser.pageProtocol = previous.pageProtocol;
        browser.pageBaseURL = previous.pageBaseURL;
        browser.path = previous.path;

        forwardHistory.push(current);
    }

    public void redo() {
        if (forwardHistory.isEmpty()) {
            return;
        }

        Snapshot next = forwardHistory.pop();

        browser.pageProtocol = next.pageProtocol;
        browser.pageBaseURL = next.pageBaseURL;
        browser.path = next.path;

        history.push(next);
    }

    private static class Snapshot {
        private final String pageProtocol;
        private final String pageBaseURL;
        private final String path;

        public Snapshot(Browser browser) {
            this.pageProtocol = browser.pageProtocol;
            this.pageBaseURL = browser.pageBaseURL;
            this.path = browser.path;
        }
    }
}
