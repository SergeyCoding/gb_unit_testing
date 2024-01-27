package com.gb.unit.testing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


//В этом проекте, вы будете работать с проектом ""Vehicle"", который представляет собой иерархию классов, включающую абстрактный базовый класс ""Vehicle"" и два его подкласса ""Car"" и ""Motorcycle"".
//
//Базовый класс ""Vehicle"" содержит абстрактные методы ""testDrive()"" и ""park()"", а также поля ""company"", ""model"", ""yearRelease"", ""numWheels"" и ""speed"".
//
//Класс ""Car"" расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта ""Car"", число колес устанавливается в 4, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 60, а в методе ""park()"" - обратно в 0.
//
//Класс ""Motorcycle"" также расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта ""Motorcycle"", число колес устанавливается в 2, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 75, а в методе ""park()"" - обратно в 0.

class VehicleTest {
    /**
     * Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
     */
    @Test
    void testCarIsVehicle() {
        var car = new Car("BMW", "XYZ", 2016);
        assertThat(car, instanceOf(Vehicle.class));
    }

    /**
     * Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    void testCarHaveFourWheels() {
        var car = new Car("BMW", "XYZ", 2016);
        assertEquals(4, car.getNumWheels());
    }

    /**
     * Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    void testMotorcycleHaveTwoWheels() {
        var motorcycle = new Motorcycle("BMW", "XYZ", 2016);
        assertEquals(2, motorcycle.getNumWheels());
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
     * машина останавливается (speed = 0).
     */
    @Test
    void testCarParkSpeed() {
        var car = new Car("BMW", "XYZ", 2016);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
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