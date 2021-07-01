package com.designpatterns.memento.Refactored;

import com.designpatterns.memento.Refactored.Browser.Browser;

public class Refactored {
    public static void run() {
        Browser browser = new Browser();
        browser.goToPage("https://google.com");
        browser.printCurrentURL();
        browser.goToPage("https://www.reddit.com/r/AskReddit");
        browser.printCurrentURL();
        browser.back();
        browser.printCurrentURL();
        browser.forward();
        browser.printCurrentURL();
    }
}
