package com.thoughtworks.tw101.exercises.exercise7;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

/**
 * Created by alexandraquintano on 3/6/17.
 */
public class GuessingGameTest {

    @Test
    public void shouldHaveTargetNumberBetween1And100() {
        GuessingGame game = new GuessingGame();

        game.play();

        assertThat(game.target(), lessThan(100));
        assertThat(game.target(), greaterThan(0));
    }

    @Test
    public void shouldPromptUserToMakeAGuess() {
        GuessingGame game = new GuessingGame();


    }
}