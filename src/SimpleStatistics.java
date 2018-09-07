import java.util.Arrays;

public class SimpleStatistics {
    public double getMinimum(double[] input) {
        return Arrays.stream(input).min().getAsDouble();
    }
}
