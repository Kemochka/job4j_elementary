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

    @Test
    void when160to028then9() {
        double expected = 9;
        Point a = new Point(1, 6, 0);
        Point b = new Point(0, 2, 8);
        double dist = a.distance3d(b);
        assertThat(expected).isEqualTo(dist, withPrecision(0.01));
    }

    @Test
    void when00to20then3() {
        double expected = 3;
        Point a = new Point(1, 0, 9);
        Point b = new Point(0, 2, 7);
        double dist = a.distance3d(b);
        assertThat(expected).isEqualTo(dist, withPrecision(0.01));
    }
}