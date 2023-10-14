package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float i = 140;
        float expecteed1 = 2.3F;
        float out1 = Converter.rubleToDollar(i);
        boolean passed1 = expecteed1 == out1;
        System.out.println("140 rubles are 2.3F. Test result : " + passed1);
    }
}

