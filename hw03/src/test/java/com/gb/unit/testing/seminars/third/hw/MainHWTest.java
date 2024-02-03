package com.gb.unit.testing.seminars.third.hw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class MainHWTest {

    @Test
    @DisplayName("Четное число")
    void evenOddNumber_odd() {
        MainHW mainHW = new MainHW();
        boolean b = mainHW.evenOddNumber(202);
        assertThat(b).isEqualTo(true);
    }

    @Test
    @DisplayName("Четное число")
    void evenOddNumber_notOdd() {
        MainHW mainHW = new MainHW();
        boolean b = mainHW.evenOddNumber(201);
        assertThat(b).isEqualTo(false);
    }

    @Test
    @DisplayName("Не в интервале")
    @ParameterizedTest
    @CsvSource({"10", "25", "100", "111"})
    void numberInInterval_Not(int k) {
        MainHW mainHW = new MainHW();
        boolean b = mainHW.numberInInterval(k);
        assertThat(b).isEqualTo(false);
    }

    @Test
    @DisplayName("В интервале")
    @ParameterizedTest
    @CsvSource({"26", "30", "99", "80"})
    void numberInInterval(int k) {
        MainHW mainHW = new MainHW();
        boolean b = mainHW.numberInInterval(k);
        assertThat(b).isEqualTo(false);
    }
}
