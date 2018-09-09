import java.util.Arrays;

public final class SimpleStatistics {
	//TODO Use BigDecimal
	public double getMinimum(double[] input) {
		return Arrays.stream(input).min().getAsDouble();
	}
	public double getMaximum(double[] input) {
		return Arrays.stream(input).max().getAsDouble();
	}

	public double getRange(double[] input) {
		return getMaximum(input) - getMinimum(input);
	}

	public int getCount(double[] input) {
		int count = input.length;
		return count;
	}
}
