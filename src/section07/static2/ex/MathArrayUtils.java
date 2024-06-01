package section07.static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double)sum / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int value : values) {
            min = Math.min(min, value);
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            max = Math.max(max, value);
        }
        return max;
    }
}
