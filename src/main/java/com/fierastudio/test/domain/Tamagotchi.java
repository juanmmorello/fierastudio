package com.fierastudio.test.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Tamagotchi {
    private Status status;

    public void performAction(Stimulus stimulus){
        this.status = stimulus.stimulate(status);
    }
}
