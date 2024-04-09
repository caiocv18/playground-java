package codewars;

public class NoBoring {

    public static int noBoringZeros(int n) {
        if (n == 0) {
            return 0;
        }

        int absValue = Math.abs(n);

        while (absValue % 10 == 0) {
            absValue /= 10;
        }

        return n < 0 ? -absValue : absValue;
    }

}

