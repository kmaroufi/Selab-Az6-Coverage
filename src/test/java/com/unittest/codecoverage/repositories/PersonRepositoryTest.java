package com.unittest.codecoverage.repositories;

import com.unittest.codecoverage.exceptions.BehaviorException;
import com.unittest.codecoverage.models.Footpassenger;
import com.unittest.codecoverage.models.Traffic;
import com.unittest.codecoverage.models.TrafficLigth;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonRepositoryTest {
    @Test
    public void testInsert_shouldThrowNullPointerExceptionWhenPersonIsNull() {
        PersonRepository repository = new PersonRepository();

        Assertions.assertThatThrownBy(() -> repository.insert(null))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("person can't be null");

    }
}
