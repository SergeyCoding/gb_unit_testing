package com.gb.unit.testing.hw06;

import org.junit.jupiter.api.Assertions;

class AbcTest {

    @org.junit.jupiter.api.Test
    void compare() {
        var l1 = new TestGenerator(5).GetList(1, 7);
        var l2 = new TestGenerator(5).GetList(1, 7);

        var z = new ListComparator(l1, l2);

        Assertions.assertTrue(z.Compare());
    }
}
