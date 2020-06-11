package com.fierastudio.test;

import com.fierastudio.test.domain.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TamagotchiTests extends TestApplicationTests {

    @Test
    public void performAction_feedWithCurrentStatusHungry_changeStatusToHappy() {
        Tamagotchi tamagotchi = new Tamagotchi(Status.HUNGRY);

        tamagotchi.performAction(new Feed());

        assertThat(tamagotchi.getStatus()).isEqualTo(Status.HAPPY);
    }

    @Test
    public void performAction_feedWithCurrentStatusSad_doubleBeepAndPuke() {
        Tamagotchi tamagotchi = new Tamagotchi(Status.SAD);

        tamagotchi.performAction(new Feed());

        assertThat(tamagotchi.getStatus()).isEqualTo(Status.SAD);
    }

    @Test
    public void performAction_feedWithCurrentStatusThirsty_doNothing() {
        Tamagotchi tamagotchi = new Tamagotchi(Status.THIRSTY);

        tamagotchi.performAction(new Feed());

        assertThat(tamagotchi.getStatus()).isEqualTo(Status.THIRSTY);
    }

    @Test
    public void performAction_feedWithCurrentStatusHungry_doNothing() {
        Tamagotchi tamagotchi = new Tamagotchi(Status.HAPPY);

        tamagotchi.performAction(new Feed());

        assertThat(tamagotchi.getStatus()).isEqualTo(Status.HAPPY);
    }

    @Test
    public void performAction_drinkWithCurrentStatusThirsty_changeStatusToHappy() {
        Tamagotchi tamagotchi = new Tamagotchi(Status.THIRSTY);

        tamagotchi.performAction(new Drink());

        assertThat(tamagotchi.getStatus()).isEqualTo(Status.HAPPY);
    }

    @Test
    public void performAction_drinkWithCurrentStatusHappy_quintupleBeep(){
        Tamagotchi tamagotchi = new Tamagotchi(Status.HAPPY);

        tamagotchi.performAction(new Drink());

        assertThat(tamagotchi.getStatus()).isEqualTo(Status.HAPPY);
    }

    @Test
    public void performAction_drinkWithCurrentStatusSad_tripleBeepAndFlashDisplay(){
        Tamagotchi tamagotchi = new Tamagotchi(Status.SAD);

        tamagotchi.performAction(new Drink());

        assertThat(tamagotchi.getStatus()).isEqualTo(Status.SAD);
    }

    @Test
    public void performAction_drinkWithCurrentStatusHungry_doNothing() {
        Tamagotchi tamagotchi = new Tamagotchi(Status.HUNGRY);

        tamagotchi.performAction(new Drink());

        assertThat(tamagotchi.getStatus()).isEqualTo(Status.HUNGRY);
    }

    @Test
    public void performAction_petWithCurrentStatusSad_changeStatusToHappy(){
        Tamagotchi tamagotchi = new Tamagotchi(Status.SAD);

        tamagotchi.performAction(new Pet());

        assertThat(tamagotchi.getStatus()).isEqualTo(Status.HAPPY);
    }

    @Test
    public void performAction_petWithCurrentStatusHappy_doNothing(){
        Tamagotchi tamagotchi = new Tamagotchi(Status.HAPPY);

        tamagotchi.performAction(new Pet());

        assertThat(tamagotchi.getStatus()).isEqualTo(Status.HAPPY);
    }

    @Test
    public void performAction_petWithCurrentStatusHungry_doNothing(){
        Tamagotchi tamagotchi = new Tamagotchi(Status.HUNGRY);

        tamagotchi.performAction(new Pet());

        assertThat(tamagotchi.getStatus()).isEqualTo(Status.HUNGRY);
    }

    @Test
    public void performAction_petWithCurrentStatusThirsty_doNothing(){
        Tamagotchi tamagotchi = new Tamagotchi(Status.THIRSTY);

        tamagotchi.performAction(new Pet());

        assertThat(tamagotchi.getStatus()).isEqualTo(Status.THIRSTY);
    }
}
