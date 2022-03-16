package com.owned.design.principles.solid.liskov.example_1.weird;

/**
 * TODO 16/03/22 Find a better example on Liskov
 */
public class RectangleV1 {

    private Integer length;
    private Integer width;

    RectangleV1(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }

    void setLength(Integer length) {
        this.length = length;
    }

    void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getArea() {
        return this.length * this.width;
    }
}