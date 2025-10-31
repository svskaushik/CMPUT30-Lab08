package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail to compile initially because hasCity() isn't implemented yet
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDoesNotHaveCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        // This will also fail initially for the same reason
        assertFalse(list.hasCity(edmonton));
    }

}
