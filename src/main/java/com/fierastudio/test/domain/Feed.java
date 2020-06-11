package com.fierastudio.test.domain;

public class Feed extends Stimulus {
    @Override
    public Status stimulate(Status status) {
        switch (status) {
            case HUNGRY:
            case HAPPY:
                return Status.HAPPY;

            case SAD:
                System.out.println("BEEP BEEP I'm puking");
                return Status.SAD;

            case THIRSTY:
                return Status.THIRSTY;

            default:
                throw new UnsupportedOperationException();
        }
    }
}
