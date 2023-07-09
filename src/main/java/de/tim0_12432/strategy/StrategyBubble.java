package de.tim0_12432.strategy;

public class StrategyBubble implements SortStrategy {

    @Override
    public int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j + 1] < numbers[j]) {
                    int tmp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        return numbers;
    }
}
