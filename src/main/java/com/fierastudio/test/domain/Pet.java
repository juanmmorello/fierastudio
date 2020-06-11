package com.fierastudio.test.domain;

public class Pet extends Stimulus {

    @Override
    Status stimulate(Status status) {
        switch (status) {

            case SAD:
            case HAPPY:
                return Status.HAPPY;

            case HUNGRY:
                return Status.HUNGRY;

            case THIRSTY:
                return Status.THIRSTY;

            default:
                throw new UnsupportedOperationException();
        }
    }
}
