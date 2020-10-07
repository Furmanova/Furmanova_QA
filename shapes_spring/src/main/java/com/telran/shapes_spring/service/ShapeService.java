package com.telran.shapes_spring.service;

import com.telran.shapes_spring.model.Shape;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShapeService {

    public void drawShapes(List<Shape> shapes) {
        shapes.forEach(Shape::draw);
    }
}
