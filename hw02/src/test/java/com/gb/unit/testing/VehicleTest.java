package com.gb.unit.testing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

class VehicleTest {
    /**
     * Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
     */
    @Test
    void testCarIsVehicle() {
        var car = new Car("BMW", "XYZ", 2016);
        assertThat(car, instanceOf(Vehicle.class));
    }
}
