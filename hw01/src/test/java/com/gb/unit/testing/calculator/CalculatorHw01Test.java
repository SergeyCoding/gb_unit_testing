package com.gb.unit.testing.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

// В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки
// и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
// Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать
// исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.

class CalculatorHw01Test {

    /**
     * Скидка 20%
     */
    @DisplayName("Тест скидки 20%")
    @Test
    void testDiscount20() {
        double value = Calculator.calculatingDiscount(100, 20);
        Assertions.assertThat(value).isEqualTo(80);
    }

    /**
     * Нет скидки
     */
    @DisplayName("Нет скидки")
    @Test
    void testNoDiscount() {
        double value = Calculator.calculatingDiscount(100, 0);
        Assertions.assertThat(value).isEqualTo(100);
    }

    /**
     * Недопустимые аргументы
     */
    @DisplayName("Недопустимые аргументы")
    @ParameterizedTest
    @CsvSource({"Негативное значение суммы покупки,-1,20", "Слишком большая скидка,100,120", "Отрицательная скидка,100,-1"})
    void testIllegalParams(String description, double purchaseAmount, int discountAmount) {
        assertThatThrownBy(() -> {
            double value = Calculator.calculatingDiscount(purchaseAmount, discountAmount);
        }).isInstanceOf(ArithmeticException.class)
                .hasMessage(description);
    }
}
