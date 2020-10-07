package com.telran.shapes_spring.model;

public class Rectangle implements Shape {
    private int width;
    private int height;
    private char symbol;

    public Rectangle(int width, int height, char symbol) {
        this.width = width;
        this.height = height;
        this.symbol = symbol;
    }

    @Override
    public void draw() {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

    }

}