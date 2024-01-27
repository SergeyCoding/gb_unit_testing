package com.gb.unit.testing;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class MotorcycleTest {

    /**
     * Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    void testMotorcycleHaveTwoWheels() {
        var motorcycle = new Motorcycle("BMW", "XYZ", 2016);
        assertEquals(2, motorcycle.getNumWheels());
    }

    /**
     * Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    void testMotorcycleTestDriveSpeed() {
        var motorcycle = new Motorcycle("BMW", "XYZ", 2016);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }


    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
     * мотоцикл останавливается (speed = 0).
     */
    @Test
    void testMotorcycleParkSpeed() {
        var motorcycle = new Motorcycle("BMW", "XYZ", 2016);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
