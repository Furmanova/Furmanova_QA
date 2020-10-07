package com.telran.shapes_spring.model;

public class Line implements Shape {
    private int length;
    private char symbol;

    public Line(int length, char symbol) {
        this.length = length;
        this.symbol = symbol;
    }

    @Override
    public void draw() {

        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
        System.out.println();

    }

}
