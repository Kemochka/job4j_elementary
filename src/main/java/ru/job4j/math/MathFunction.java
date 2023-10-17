package ru.job4j.math;

public class MathFunction {
    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double subtract(double first, double second) {
        return first - second;
    }

    public static double divide(double first, double second) {
        return first / second;
    }

    public static double subtractAndDivide(double first, double second) {
        return ru.job4j.math.MathFunction.subtract(first, second)
        + ru.job4j.math.MathFunction.divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractAndDivide(10, 20));
    }
}
