package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void testSetAndGetAge() {
        Person person = new Person();
        person.setAge(21);

        Assertions.assertEquals(person.getAge(), 21);
    }
}
