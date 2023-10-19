package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double subAndDivide(double first, double second) {
        return sub(first, second) + divide(first, second);
    }

    public static double allOperations(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + sub(first, second) + divide(first, second);
    }

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + subAndDivide(10, 20));
        System.out.println("Результат расчета равен: " + allOperations(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}
