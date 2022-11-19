package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldSumAllSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.sumAllSales(sale);
        int expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAverageSumSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.averageSumSales(sale);
        int expected = 15;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMaxMonth() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maxNumberMonth(sale);
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinMonth() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minNumberMonth(sale);
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldAverageSalesMinMonth() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.averageSaleMinMonth(sale);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAdverageSalesMaxMonth() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.averageSaleMaxMonth(sale);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

}
