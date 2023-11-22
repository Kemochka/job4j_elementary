package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(expected).isEqualTo(dist, withPrecision(0.01));
    }

    @Test
    void when30to20then1() {
        double expected = 1;
        Point a = new Point(3, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        assertThat(expected).isEqualTo(dist, withPrecision(0.01));
    }

    @Test
    void when60to23then5() {
        double expected = 5;
        Point a = new Point(6, 0);
        Point b = new Point(2, 3);
        double dist = a.distance(b);
        assertThat(expected).isEqualTo(dist, withPrecision(0.01));
    }
}