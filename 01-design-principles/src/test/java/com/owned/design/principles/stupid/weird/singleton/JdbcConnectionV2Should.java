package com.owned.design.principles.stupid.weird.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JdbcConnectionV2Should {

    //problem starts here ....
    private final Connection sut = JdbcConnectionV2.getInstance();

    @BeforeEach
    void setUp() {
    }

    @Test
    void whatever_test() {

    }
}