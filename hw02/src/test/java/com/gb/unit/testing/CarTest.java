package com.gb.unit.testing;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class CarTest {

    /**
     * Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    void testCarHaveFourWheels() {
        var car = new Car("BMW", "XYZ", 2016);
        assertEquals(4, car.getNumWheels());
    }

    /**
     * Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive())
     */
    @Test
    void testCarTestDriveSpeed() {
        var car = new Car("BMW", "XYZ", 2016);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
     * машина останавливается (speed = 0).
     */
    @Test
    void testCarParkSpeed() {
        var car = new Car("BMW", "XYZ", 2016);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
}
