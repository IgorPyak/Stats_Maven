package ru.netology.stats;

public class StatsService {
    public int sumAllSales(int[] sale) {
        int sum = 0;
        for (int sl : sale) {
            sum += sl;
        }
        return sum;
    }

    public int averageSumSales(int[] sale) {
        return sumAllSales(sale) / 12;
    }

    public int maxNumberMonth(int[] sale) {
        int maxMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int minNumberMonth(int[] sale) {
        int minMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < sale[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int averageSaleMinMonth(int[] sale) {
        int average = averageSumSales(sale);
        int minValue = 0;
        for (int sl : sale) {
            if (sl < average) {
                minValue++;
            }

        }
        return minValue;

    }

    public int averageSaleMaxMonth(int[] sale) {
        int average = averageSumSales(sale);
        int maxValue = 0;
        for (int sl : sale) {
            if (sl > average) {
                maxValue++;
            }

        }
        return maxValue;
    }


}

