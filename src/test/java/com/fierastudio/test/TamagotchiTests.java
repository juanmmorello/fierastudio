package com.fierastudio.test;

import com.fierastudio.test.domain.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TamagotchiTests extends TestApplicationTests {

    @Test
    public void performAction_feedWithCurrentStatusHungry_changeStatusToHappy() {
        Tamagotchi tamagotchi = new Tamagotchi(new Hungry());

        tamagotchi.setStatus(tamagotchi.getStatus().toFeed());

        assertThat(tamagotchi.getStatus().getClass()).isEqualTo(Happy.class);
    }

    @Test
    public void performAction_feedWithCurrentStatusSad_doubleBeepAndPuke() {
        Tamagotchi tamagotchi = new Tamagotchi(new Sad());

        tamagotchi.setStatus(tamagotchi.getStatus().toFeed());

        assertThat(tamagotchi.getStatus().getClass()).isEqualTo(Sad.class);
    }

    @Test
    public void performAction_feedWithCurrentStatusThirsty_doNothing() {
        Tamagotchi tamagotchi = new Tamagotchi(new Thirsty());

        tamagotchi.setStatus(tamagotchi.getStatus().toFeed());

        assertThat(tamagotchi.getStatus().getClass()).isEqualTo(Thirsty.class);
    }

    @Test
    public void performAction_feedWithCurrentStatusHappy_doNothing() {
        Tamagotchi tamagotchi = new Tamagotchi(new Happy());

        tamagotchi.setStatus(tamagotchi.getStatus().toFeed());

        assertThat(tamagotchi.getStatus().getClass()).isEqualTo(Happy.class);
    }

    @Test
    public void performAction_drinkWithCurrentStatusThirsty_changeStatusToHappy() {
        Tamagotchi tamagotchi = new Tamagotchi(new Thirsty());

        tamagotchi.setStatus(tamagotchi.getStatus().toDrink());

        assertThat(tamagotchi.getStatus().getClass()).isEqualTo(Happy.class);
    }

    @Test
    public void performAction_drinkWithCurrentStatusHappy_quintupleBeep(){
        Tamagotchi tamagotchi = new Tamagotchi(new Happy());

        tamagotchi.setStatus(tamagotchi.getStatus().toDrink());

        assertThat(tamagotchi.getStatus().getClass()).isEqualTo(Happy.class);
    }

    @Test
    public void performAction_drinkWithCurrentStatusSad_tripleBeepAndFlashDisplay(){
        Tamagotchi tamagotchi = new Tamagotchi(new Sad());

        tamagotchi.setStatus(tamagotchi.getStatus().toDrink());

        assertThat(tamagotchi.getStatus().getClass()).isEqualTo(Sad.class);
    }

    @Test
    public void performAction_drinkWithCurrentStatusHungry_doNothing() {
        Tamagotchi tamagotchi = new Tamagotchi(new Hungry());

        tamagotchi.setStatus(tamagotchi.getStatus().toDrink());

        assertThat(tamagotchi.getStatus().getClass()).isEqualTo(Hungry.class);
    }

    @Test
    public void performAction_petWithCurrentStatusSad_changeStatusToHappy(){
        Tamagotchi tamagotchi = new Tamagotchi(new Sad());

        tamagotchi.setStatus(tamagotchi.getStatus().toPet());

        assertThat(tamagotchi.getStatus().getClass()).isEqualTo(Happy.class);
    }

    @Test
    public void performAction_petWithCurrentStatusHappy_doNothing(){
        Tamagotchi tamagotchi = new Tamagotchi(new Happy());

        tamagotchi.setStatus(tamagotchi.getStatus().toPet());

        assertThat(tamagotchi.getStatus().getClass()).isEqualTo(Happy.class);
    }

    @Test
    public void performAction_petWithCurrentStatusHungry_doNothing(){
        Tamagotchi tamagotchi = new Tamagotchi(new Hungry());

        tamagotchi.setStatus(tamagotchi.getStatus().toPet());

        assertThat(tamagotchi.getStatus().getClass()).isEqualTo(Hungry.class);
    }

    @Test
    public void performAction_petWithCurrentStatusThirsty_doNothing(){
        Tamagotchi tamagotchi = new Tamagotchi(new Thirsty());

        tamagotchi.setStatus(tamagotchi.getStatus().toPet());

        assertThat(tamagotchi.getStatus().getClass()).isEqualTo(Thirsty.class);
    }
}
