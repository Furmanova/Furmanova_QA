package com.telran.shapes_spring.config;

import com.telran.shapes_spring.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Config {

    @Bean
    public Line line1() {
        return new Line(10, '*');
    }

    @Bean
    public Rectangle rectangle() {
        return new Rectangle(20, 5, '#');
    }

    @Bean
    public Triangle triangle() {
        return new Triangle(5, 6, '+');
    }

    @Bean
    public Picture picture(Line line1, Rectangle rectangle, Triangle triangle) {
        return new Picture(Arrays.asList(line1, rectangle, line1, triangle, line1));
    }

}