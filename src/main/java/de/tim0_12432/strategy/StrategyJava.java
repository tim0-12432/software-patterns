package de.tim0_12432.strategy;

import java.util.Arrays;

public class StrategyJava implements SortStrategy {

    @Override
    public int[] sort(int[] numbers) {
        return Arrays.stream(numbers).sorted().toArray();
    }
}
