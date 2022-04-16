package edu.junit.ex01;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExtendedListTest {

    @Test
    void map() {
        ExtendedList<Integer> integers = new ExtendedList<>(2,3,4);
        ExtendedList<Integer> expected = new ExtendedList<>(4,9,16);
        List<Integer> actual = integers.map(x -> x * x);
        assertEquals(expected, actual);
    }

    @Test
    void map_shouldReturnEmptyList() {
        ExtendedList<Integer> integers = new ExtendedList<>();
        ExtendedList<Integer> expected = new ExtendedList<>();
        List<Integer> actual = integers.map(x -> x * x);
        assertEquals(expected, actual);
    }
}