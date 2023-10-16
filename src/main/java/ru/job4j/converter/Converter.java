package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollars(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        expected = 2.3F;
        out = Converter.rubleToDollars(in);
        passed = expected == out;
        System.out.println("140 rubles are 2.3F. Test result : " + passed);
    }
}

