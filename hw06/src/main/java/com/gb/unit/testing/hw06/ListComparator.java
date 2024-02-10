package com.gb.unit.testing.hw06;

import java.util.List;

public class ListComparator {

    private final List<Integer> list1;
    private final List<Integer> list2;

    public ListComparator(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public boolean Compare() {
        return true;
    }

    public double GetAvg(int listIndex) {
        if (listIndex == 1)
            return GetListAvg(list1);

        if (listIndex == 2)
            return GetListAvg(list2);

        throw new RuntimeException("Неверное значние listIndex");
    }

    private double GetListAvg(List<Integer> list1) {
        return 0;
    }
}
