package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FootpassengerTest {
    @Test
    public void testSetAndGetCrossedTheCrosswalk() {
        Footpassenger footpassenger = new Footpassenger();
        footpassenger.setCrossedTheCrosswalk(true);

        Assertions.assertTrue(footpassenger.crossedTheCrosswalk());
    }
}
