package com.fierastudio.test.domain;

public class Sad extends Status implements Stimulus {

    @Override
    public Status toFeed() {
        System.out.println("BEEP BEEP *puking*");
        return this;
    }

    @Override
    public Status toDrink() {
        System.out.println("BEEP BEEP BEEP *screen flashes*");
        return this;
    }

    @Override
    public Status toPet() {
        return new Happy();
    }
}
