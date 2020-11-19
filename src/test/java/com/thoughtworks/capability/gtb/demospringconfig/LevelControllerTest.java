package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
class LevelControllerTest {

    @Nested
    @SpringBootTest(properties = { "levelNumber=0" })
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
    @SpringBootTest(properties = { "levelNumber=1" })
    class OneLevelNumber {

        @Autowired
        LevelController levelController;

        @Test
        void should_return_basic_when_level_number_less_than_1() {
            String result = levelController.getLevel();
            assertEquals("advanced", result);
        }

    }

    @Nested
    @SpringBootTest(properties = { "levelNumber=2" })
    class TwoLevelNumber {

        @Autowired
        LevelController levelController;

        @Test
        void should_return_basic_when_level_number_less_than_1() {
            String result = levelController.getLevel();
            assertEquals("advanced", result);
        }

    }

}