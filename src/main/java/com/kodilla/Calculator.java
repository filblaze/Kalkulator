package com.kodilla;

public class Calculator {

    public Calculator() {
    }

    public double addAToB(double a, double b) {
        return a + b;
    }

    public double subtractBFromA(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addAToB(2.0, 3.0));
    }
}
