package com.axonactive.resultvalue;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ResultValue {

    WIN(3),
    DRAW(1),
    LOOSE(0);

    private int val;

}
