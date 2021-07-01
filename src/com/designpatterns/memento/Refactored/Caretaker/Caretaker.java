package com.designpatterns.memento.Refactored.Caretaker;

import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> history = new Stack<>();
    private final Stack<Memento> forwardHistory = new Stack<>();

    public void push(Originator originator) {
        history.push(originator.save());
        forwardHistory.clear();
    }

    public void undo() {
        if (history.size() < 2) {
            return;
        }

        Memento current = history.pop();
        Memento previous = history.pop();
        previous.restore();
        forwardHistory.push(current);
    }

    public void redo() {
        if (forwardHistory.isEmpty()) {
            return;
        }

        Memento next = forwardHistory.pop();
        next.restore();
        history.push(next);
    }
}
