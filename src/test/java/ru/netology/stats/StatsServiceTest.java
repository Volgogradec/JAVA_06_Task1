package ru.netology.stats;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void statisticSaleSum() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем метод
        int actual = (int) service.statisticSaleSum(sale);

        // задаём контрольное значение
        long expected = 180;
        assertEquals(expected, actual);
    }

}