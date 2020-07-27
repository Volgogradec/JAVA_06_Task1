package ru.netology.stats;

public class StatsService {
     public long statisticSaleSum(int[] sale) {
        long sum = 0;
        for (long purchase : sale) {
            sum += purchase;
        }
        return sum;
    }

    public double statisticSaleAverageMonth(int[] sale) {
        int numberSale = sale.length;
        long sum = 0;
        for (long purchase : sale) {
            sum += purchase;
        }

        double averageMonth = sum / numberSale;
        return averageMonth;
    }

    public long statisticSaleMax(int[] sale) {
        int saleMax = sale[0];

        // Если элемент массив больше saleMax, то переменная перезаписывается
        for (int purchase : sale) {
            if (purchase > saleMax) {
                saleMax = purchase;
            }
        }
        return saleMax;
    }

    public long statisticSaleMin(int[] sale) {
        int saleMin = sale[0];

        // Запускаем сравнение - ищем минимальное значение
        // Если элемент массива меньше saleMin, то переменная перезаписывается
        for (int purchase : sale) {
            if (purchase < saleMin) {
                saleMin = purchase;
            }
        }
        return saleMin;
    }

    public int statisticMonthUnderAverage(int[] sale) {
        int averageSum = (int) statisticSaleAverageMonth(sale);
        int numberUnderAverage = 0;

        // Запускаем цикл от 0 до длины массива sale
        for (int i = 0; i < sale.length; i++) {
            // если значение из массива меньше среднего, то увеличиваем счётчик numberUnderAverage на 1
            if (sale[i] < averageSum) {
                numberUnderAverage = numberUnderAverage + 1;
            }
        }
        return numberUnderAverage;
    }

    public int statisticMonthOverAverage(int[] sale) {
        int averageSum = (int) statisticSaleAverageMonth(sale);
        int numberOverAverage = 0;

        // Запускаем цикл от 0 до длины массива sale
        for (int i = 0; i < sale.length; i++) {
            // если значение из массива больше среднего, то увеличиваем счётчик numberUnderAverage на 1
            if (sale[i] > averageSum) {
                numberOverAverage = numberOverAverage + 1;
            }
        }
        return numberOverAverage;
    }

}
