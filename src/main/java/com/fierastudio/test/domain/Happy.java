package com.fierastudio.test.domain;

public class Happy extends Status implements Stimulus {

    @Override
    public Status toFeed() {
        return this;
    }

    @Override
    public Status toDrink() {
        System.out.println("BEEP BEEP BEEP BEEP BEEP");
        return this;
    }

    @Override
    public Status toPet() {
        return this;
    }
}
