package com.telran;

import java.util.Objects;

public class Casino {
    String name;
    int sum;
    int steps;

    public Casino(String name, int sum, int steps) {
        this.name = name;
        this.sum = sum;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    @Override
    public String toString() {
        return "Casino{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                ", steps=" + steps +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casino casino = (Casino) o;
        return sum == casino.sum &&
                steps == casino.steps &&
                name.equals(casino.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sum, steps);
    }
}
