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

	public double getSum(double[] input) {
		double sum = Arrays.stream(input).sum();
		return sum;
	}

	public double getMean(double[] input) {
		double mean = getSum(input) / getCount(input);
		return mean;
	}

	public double getMedian(double[] input) {
		Arrays.sort(input);
		int count = getCount(input);
		double median;
		int medianIndex = (count / 2);
		if(count % 2 == 1) {
			median = input[medianIndex];
		}
		else {
			median = (input[medianIndex - 1] + input[medianIndex]) / 2;
		}
		return median;
	}
}
