package com.designpatterns.memento.Original;

public class Original {
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
