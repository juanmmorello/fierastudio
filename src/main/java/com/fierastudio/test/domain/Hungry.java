package com.fierastudio.test.domain;

public class Hungry extends Status implements Stimulus {

    @Override
    public Status toFeed() {
        return new Happy();
    }

    @Override
    public Status toDrink() {
        return this;
    }

    @Override
    public Status toPet() {
        return this;
    }
}
