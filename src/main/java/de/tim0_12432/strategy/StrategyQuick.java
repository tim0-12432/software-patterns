package de.tim0_12432.strategy;

public class StrategyQuick implements SortStrategy {

    @Override
    public int[] sort(int[] numbers) {
        return sort(numbers, 0, numbers.length - 1);
    }

    private int[] sort(int[] numbers, int left, int right) {
        if (left < right) {
            int q = partition(numbers, left, right);
            sort(numbers, left, q);
            sort(numbers, q + 1, right);
        }
        return numbers;
    }

    private int partition(int[] numbers, int left, int right) {
        int i, j, x = numbers[(left + right) / 2];
        i = left - 1;
        j = right + 1;
        while (true) {
            do {
                i++;
            } while (numbers[i] < x);
            do {
                j--;
            } while (numbers[j] > x);
            if (i < j) {
                int tmp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = tmp;
            } else {
                return j;
            }
        }
    }
}
