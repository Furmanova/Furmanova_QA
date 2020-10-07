package com.telran.shapes_spring.model;

import java.util.Collections;
import java.util.List;

public class Picture implements Shape {

    private List<Shape> shapes;

    public Picture(List<Shape> shapes) {
        this.shapes = Collections.unmodifiableList(shapes);
    }

    /**
     * iterates over all the shapes and draws it
     */
    @Override
    public void draw() {
        shapes.forEach(Shape::draw);
    }

}
