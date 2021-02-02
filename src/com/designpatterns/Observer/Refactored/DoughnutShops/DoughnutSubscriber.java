package com.designpatterns.Observer.Refactored.DoughnutShops;

import java.util.List;

public interface DoughnutSubscriber {
    void doughnutUpdate(List<String> doughnuts);
}
