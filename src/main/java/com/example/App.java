package com.example;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        App calc = new App();

        int sum = calc.add(10, 5);
        int diff = calc.subtract(10, 5);
        int prod = calc.multiply(10, 5);
        int div = calc.divide(10, 5);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + prod);
        System.out.println("Division: " + div);
    }
}
