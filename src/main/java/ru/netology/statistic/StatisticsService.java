package ru.netology.statistic;

import org.jetbrains.annotations.NotNull;

public class StatisticsService {
    public long findMax(long @NotNull [] incomes) {
        long currentMaxIndex = 0;
        long currentMax = incomes[0];
        for (long income : incomes)
            if (currentMax < income)
                currentMax = income;
        return currentMax;
    }
}
