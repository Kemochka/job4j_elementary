package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax4To3Then4() {
        int left = 4;
        int right = 3;
        int result = new Max().max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3Then3() {
        int left = 1;
        int right = 2;
        int c = 3;
        int result = new Max().max(left, right, c);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To6To7To9Then9() {
        int left = 7;
        int right = 9;
        int c = 6;
        int d = 2;
        int result = new Max().max(left, right, c, d);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}