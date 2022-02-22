package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findBigMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1562, 1570, 1455, 1786, 1622, 1836, 1930};
        long expected = 1930;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}