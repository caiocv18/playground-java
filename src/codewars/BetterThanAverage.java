package codewars;

import java.util.Arrays;

public class BetterThanAverage {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        float average = (float) Arrays.stream(classPoints).sum() / classPoints.length;
        return yourPoints > average;
    }
}
