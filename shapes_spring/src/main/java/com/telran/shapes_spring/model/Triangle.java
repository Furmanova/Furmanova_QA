package com.telran.shapes_spring.model;

public class Triangle implements Shape {
    private int width;
    private int height;
    private char symbol;

    public Triangle(int width, int height, char symbol) {
        this.width = width;
        this.height = height;
        this.symbol = symbol;
    }


    @Override
    public void draw() {
        for (int i = 0; i <= width; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}