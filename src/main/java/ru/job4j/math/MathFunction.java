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

    public static double sub(double first, double second) {
        return first - second;
    }

    public static double divide(double first, double second) {
        return first / second;
    }

    public static double subAndDivide(double first, double second) {
        return ru.job4j.math.MathFunction.sub(first, second)
        + ru.job4j.math.MathFunction.divide(first, second);
    }

    public static double allOperations(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + sub(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAndDivide(10, 20));
        System.out.println("Результат расчета равен: " + allOperations(10, 20));
    }
}
