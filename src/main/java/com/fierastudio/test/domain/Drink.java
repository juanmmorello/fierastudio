package com.fierastudio.test.domain;

public class Drink extends Stimulus{

    @Override
    Status stimulate(Status status) {
        switch (status){
            case THIRSTY:
                return Status.HAPPY;

            case HAPPY:
                System.out.println("BEEP BEEP BEEP BEEP BEEP");
                return Status.HAPPY;

            case SAD:
                System.out.println("BEEP BEEP BEEP *display flashes*");
                return Status.SAD;

            case HUNGRY:
                return Status.HUNGRY;

            default:
                throw new UnsupportedOperationException();
        }
    }
}
