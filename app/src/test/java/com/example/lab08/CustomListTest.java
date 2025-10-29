package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City city = new City("Calgary", "Alberta");
        list.addCity(city);
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }
    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());

        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(1, list.countCities());

        list.addCity(new City("Calgary", "Alberta"));
        assertEquals(2, list.countCities());
    }

}
