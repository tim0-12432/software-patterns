package de.tim0_12432.strategy;

public class Main {

    public static void main(String[] args) {
        int[] numbers = { 232, 3, 5, 56, 3, 9, 7, 32, 980, 76, 1, 23, 90 };
        SortStrategy strategy = new StrategyJava();
        long start = System.nanoTime();
        int[] sortedJava = strategy.sort(numbers);
        long end = System.nanoTime();
        for (int i : sortedJava) {
            System.out.print(i + " ");
        }
        System.out.println("\nJava: " + (end - start) + "ns\n");

        strategy = new StrategyBubble();
        start = System.nanoTime();
        int[] sortedBubble = strategy.sort(numbers);
        end = System.nanoTime();
        for (int i : sortedBubble) {
            System.out.print(i + " ");
        }
        System.out.println("\nBubble: " + (end - start) + "ns\n");

        strategy = new StrategyQuick();
        start = System.nanoTime();
        int[] sortedQuick = strategy.sort(numbers);
        end = System.nanoTime();
        for (int i : sortedQuick) {
            System.out.print(i + " ");
        }
        System.out.println("\nQuick: " + (end - start) + "ns");
    }
}
