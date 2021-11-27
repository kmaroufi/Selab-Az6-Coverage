package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrafficTest {
    @Test
    public void testSetAndGetStreetDirectionFlow() {
        Traffic traffic = new Traffic();
        traffic.setStreetDirectionFlow(StreetDirectionFlow.ONE_WAY);

        Assertions.assertEquals(traffic.getStreetDirectionFlow(),
                StreetDirectionFlow.ONE_WAY);
    }
}
