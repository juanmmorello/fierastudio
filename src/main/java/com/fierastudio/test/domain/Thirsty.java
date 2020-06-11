package com.fierastudio.test.domain;

public class Thirsty extends Status implements Stimulus {

    @Override
    public Status toFeed() {
        return this;
    }

    @Override
    public Status toDrink() {
        return new Happy();
    }

    @Override
    public Status toPet() {
        return this;
    }
}
