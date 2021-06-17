package com.designpatterns.mediator.Refactored.Components;

import com.designpatterns.mediator.Refactored.Mediators.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
