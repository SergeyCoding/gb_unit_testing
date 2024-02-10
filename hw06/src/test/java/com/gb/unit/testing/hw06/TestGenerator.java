package com.gb.unit.testing.hw06;

import java.util.ArrayList;
import java.util.List;

/**
 * Генератор списка чисел, должен использоваться только для тестирования
 */
public class TestGenerator {

    private final int count;

    public TestGenerator(int count) {
        this.count = count;
    }

    public List<Integer> GetList(int min, int max) {
        var l = new ArrayList<Integer>();

        for (int i = 0; i < count; i++) {
            l.add((int) (Math.random() * (max - min) + min));
        }

        return l;
    }
}
