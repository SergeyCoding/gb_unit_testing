package com.gb.unit.testing.hw06;

import java.util.List;

/**
 * Сравнение двух списков.
 */
public class ListComparator {
    /**
     * First list.
     */
    private final List<Integer> list1;
    /**
     * Second list.
     */
    private final List<Integer> list2;

    /**
     * Сравнение двух списков.
     *
     * @param plist1 First list.
     * @param plist2 Second list.
     */
    public ListComparator(final List<Integer> plist1,
                          final List<Integer> plist2) {
        list1 = plist1;
        list2 = plist2;
    }

    /**
     * Сравнение средних значений, и выдача результата в текстовом виде.
     *
     * @return Результат сравнения
     */
    public String compareInformation() {
        double avg1 = getAvg(1);
        double avg2 = getAvg(2);

        if (avg1 == avg2) {
            return "Средние значения равны";
        }

        if (avg1 > avg2) {
            return "Первый список имеет большее среднее значение";
        }

        return "Второй список имеет большее среднее значение";
    }

    /**
     * Среднее значение выбранного списка.
     *
     * @param listIndex номер списка 1 или 2
     * @return среднее значение
     */
    public double getAvg(final int listIndex) {
        if (listIndex == 1) {
            return getListAvg(list1);
        }

        if (listIndex == 2) {
            return getListAvg(list2);
        }

        throw new RuntimeException("Неверное значние listIndex");
    }

    private double getListAvg(final List<Integer> plist) {
        var s = 0.0;

        for (var item : plist) {
            s = s + item;
        }

        return s / plist.size();
    }
}
