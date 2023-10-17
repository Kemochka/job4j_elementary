package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then100() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman172Then71() {
        short in = 172;
        double expected = 71.3;
        double out = Fit.womanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}