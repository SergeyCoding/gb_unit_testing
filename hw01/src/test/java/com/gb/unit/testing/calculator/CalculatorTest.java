package com.gb.unit.testing.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Задание 1.
// В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и возвращает
// сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
// Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
// Не забудьте написать тесты для проверки этого поведения.
//
// Задание 2. (необязательное)
// Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых метода в класс Shop:
// Метод sortProductsByPrice(), который сортирует список продуктов по стоимости. Метод getMostExpensiveProduct(),
// который возвращает самый дорогой продукт. Напишите тесты, чтобы проверить, что магазин хранит верный список
// продуктов (правильное количество продуктов, верное содержимое корзины).
// Напишите тесты для проверки корректности работы метода getMostExpensiveProduct. Напишите тесты для проверки
// корректности работы метода sortProductsByPrice (проверьте правильность сортировки). Используйте класс Product
// для создания экземпляров продуктов и класс Shop для написания методов сортировки и тестов.

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculation() {
        double v = Calculator.calculatingDiscount(1, 2);

    }
}