package com.designpatterns.observer.Refactored;

import com.designpatterns.observer.Refactored.DoughnutShops.DoughnutSubscriber;

import java.util.ArrayList;
import java.util.List;

public class DoughnutFactory {
    private List<String> doughnuts = new ArrayList<>();
    private List<DoughnutSubscriber> subscribers = new ArrayList<>();

    public void subscribe(DoughnutSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(DoughnutSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void addDoughnut(String doughnut) {
        doughnuts.add(doughnut);
        subscribers.forEach(subscriber -> subscriber.doughnutUpdate(doughnuts));
    }
}
