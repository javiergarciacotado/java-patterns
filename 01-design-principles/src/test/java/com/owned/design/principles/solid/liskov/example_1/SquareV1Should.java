package com.owned.design.principles.solid.liskov.example_1;

import com.owned.design.principles.solid.liskov.example_1.weird.SquareV1;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareV1Should {

    @Test
    void not_respecting_liskov_principle() {
        Integer lengthAndWidth = 2;
        SquareV1 square = new SquareV1(lengthAndWidth);

        //Behave like a rectangle
        Integer newSquareLength = 4;
        square.setLength(newSquareLength);

        assertThat(square.getArea()).isNotEqualTo(8);
    }


}
