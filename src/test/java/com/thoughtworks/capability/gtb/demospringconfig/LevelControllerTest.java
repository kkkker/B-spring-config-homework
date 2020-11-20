package com.thoughtworks.capability.gtb.demospringconfig;

import javafx.application.Application;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
class LevelControllerTest {

    @Nested
    @SpringBootTest
    @ContextConfiguration(
            initializers = ZeroPropertyOverrideContextInitializer.class)
    class ZeroLevelNumber {

        @Autowired
        LevelController levelController;

        @Test
        void should_return_basic_when_level_number_less_than_1() {
            String result = levelController.getLevel();
            assertEquals("basic", result);
        }

    }

    @Nested
    @SpringBootTest
    @ContextConfiguration(
            initializers = OnePropertyOverrideContextInitializer.class)
    class OneLevelNumber {

        @Autowired
        LevelController levelController = new LevelController();

        @Test
        void should_return_basic_when_level_number_less_than_1() {
            String result = levelController.getLevel();
            assertEquals("advanced", result);
        }

    }

    @Nested
    @SpringBootTest
    @ContextConfiguration(
            initializers = TwoPropertyOverrideContextInitializer.class)
    class TwoLevelNumber {

        @Autowired
        LevelController levelController = new LevelController();

        @Test
        void should_return_basic_when_level_number_less_than_1() {
            String result = levelController.getLevel();
            assertEquals("advanced", result);
        }

    }

}