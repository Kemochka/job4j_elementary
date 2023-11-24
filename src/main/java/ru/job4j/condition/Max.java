package ru.job4j.condition;

public class Max {

    public int max(int left, int right) {
        return Math.max(left, right);
    }

    public int max(int left, int right, int c) {
        return max(left, max(right, c));
    }

    public int max(int left, int right, int c, int d) {
        return max(left, right, max(c, d));
    }
}
