package ru.netology.stats;

public class StatsService {
     public long statisticSaleSum(int[] sale) {
         // Инициализируем массив
//        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // начинаем с нуля
        long sum = 0;

        // запускаем суммирование
        for (long purchase : sale) {
            sum += purchase;
        }
        return sum;
    }
}
