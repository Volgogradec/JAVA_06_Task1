package ru.netology.stats;

public class StatsService {
     public long statisticSaleSum(int[] sale) {
        // Начинаем суммировать с нуля
        long sum = 0;

        // Запускаем суммирование
        for (long purchase : sale) {
            sum += purchase;
        }
        return sum;
    }

    public long statisticSaleAverageMonth(int[] sale) {
        // Определяем количество элементов в массиве
        int lenthSale = sale.length;

        // Начинаем суммировать с нуля
        long sum = 0;

        // Запускаем суммирование
        for (long purchase : sale) {
            sum += purchase;
        }

        long AverageMonth = sum / lenthSale;
        return AverageMonth;
    }

    public long statisticSaleMax(int[] sale) {
        // Задаём точку отсчёта с первого элемента
        int saleMax = sale[0];

        // Запускаем сравнение - ищем максимальное значение
        // Если последующий элемент больше первого, то переменная перезаписывается
        for (int purchase : sale) {
            if (saleMax < purchase) {
                saleMax = purchase;
            }
        }

        // Возвращаем максимальное значение
        return saleMax;
    }

    public long statisticSaleMin(int[] sale) {
        // Инициализируем массив
        // int[] sale1 = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // Задаём точку отсчёта с первого элемента
        int saleMin = sale[0];

        // Запускаем сравнение - ищем минимальное значение
        // Если последующий элемент меньше первого, то переменная перезаписывается
        for (int purchase : sale) {
            if (saleMin > purchase) {
                saleMin = purchase;
            }
        }

        // Возвращаем минимальное значение
        return saleMin;
    }
}
