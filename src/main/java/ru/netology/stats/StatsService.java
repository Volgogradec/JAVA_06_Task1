package ru.netology.stats;

public class StatsService {
     public long statisticSaleSum(int[] sale) {
         // Инициализируем массив
//        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // начинаем суммировать с нуля
        long sum = 0;

        // запускаем суммирование
        for (long purchase : sale) {
            sum += purchase;
        }
        return sum;
    }

    public long statisticSaleAverageMonth(int[] sale) {
        // Инициализируем массив
       // int[] sale1 = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // Определяем количество элементов в массиве
        int lenthSale = sale.length;

        // начинаем суммировать с нуля
        long sum = 0;

        // запускаем суммирование
        for (long purchase : sale) {
            sum += purchase;
        }

        long AverageMonth = sum / lenthSale;
        return AverageMonth;
    }
}
