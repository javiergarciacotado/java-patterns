package com.owned.design.principles.stupid.weird.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JdbcConnectionV2Should {

    //problem starts here ....
    private final Connection sut = JdbcConnectionV2.getInstance();

    private Connection jdbcConnectionV2;

    @BeforeEach
    void setUp() {
        //Do you see it?
        jdbcConnectionV2 = JdbcConnectionV2.getInstance();
    }

    @Test
    void whatever_test() {
        assertThat(1).isEqualTo(1);
    }
}