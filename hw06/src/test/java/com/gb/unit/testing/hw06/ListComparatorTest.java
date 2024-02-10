package com.gb.unit.testing.hw06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class ListComparatorTest {

    @DisplayName("Создание объекта")
    @Test
    void listComparator_Create_Test() {
        var l1 = new TestGenerator(5).GetList(1, 7);
        var l2 = new TestGenerator(6).GetList(1, 7);

        var listComparator = new ListComparator(l1, l2);

        Assertions.assertNotNull(listComparator);
    }

    @DisplayName("Рассчитывает среднее значение первого списка")
    @Test
    void listComparator_AvgList1_Test() {
        var l1 = new ArrayList<Integer>(Arrays.asList(1, 10, 19));
        var l2 = new TestGenerator(6).GetList(1, 7);

        var listComparator = new ListComparator(l1, l2);
        var result = listComparator.getAvg(1);

        Assertions.assertEquals(10.0, result);
    }

    @DisplayName("Рассчитывает среднее значение второго списка")
    @Test
    void listComparator_AvgList2_Test() {
        var l1 = new TestGenerator(5).GetList(1, 7);
        var l2 = new ArrayList<Integer>(Arrays.asList(1, 10, 19));

        var listComparator = new ListComparator(l1, l2);
        var result = listComparator.getAvg(2);

        Assertions.assertEquals(10, result);
    }

    @DisplayName("Ожидаемое исключение")
    @Test
    void listComparator_AvgListException_Test() {
        var l1 = new TestGenerator(5).GetList(1, 7);
        var l2 = new TestGenerator(6).GetList(1, 7);

        var listComparator = new ListComparator(l1, l2);

        Assertions.assertThrows(RuntimeException.class, () -> listComparator.getAvg(0), "Неверное значение listIndex");
    }


    @DisplayName("Тест: Первый список имеет большее среднее значение")
    @Test
    void listComparator_AvgList1Bigger_Test() {
        var l1 = new TestGenerator(5).GetList(1, 7);
        var l2 = new TestGenerator(6).GetList(1, 7);

        var listComparator = new ListComparator(l1, l2);
        var result = listComparator.compareInformation();

        Assertions.assertNotNull("Первый список имеет большее среднее значение", result);
    }

    @DisplayName("Тест: Второй список имеет большее среднее значение")
    @Test
    void listComparator_AvgList2Bigger_Test() {
        var l1 = new TestGenerator(5).GetList(1, 7);
        var l2 = new TestGenerator(6).GetList(8, 10);

        var listComparator = new ListComparator(l1, l2);
        var result = listComparator.compareInformation();

        Assertions.assertNotNull("Второй список имеет большее среднее значение", result);
    }

    @DisplayName("Тест: Средние значения равны")
    @Test
    void listComparator_AvgEquals_Test() {
        var l1 = new TestGenerator(5).GetList(1, 7);
        var l2 = l1;

        var listComparator = new ListComparator(l1, l2);
        var result = listComparator.compareInformation();

        Assertions.assertNotNull("Средние значения равны", result);
    }
}
