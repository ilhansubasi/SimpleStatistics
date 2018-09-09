public class Main {

	public static void main(String[] args) {
		double dataSet[] = {8.7, 1.01, 2.1, 5.02};

		double min = new SimpleStatistics().getMinimum(dataSet);
		System.out.println("Minimum: " + min);

		double max = new SimpleStatistics().getMaximum(dataSet);
		System.out.println("Maximum: " + max);

		double range = new SimpleStatistics().getRange(dataSet);
		System.out.println("Range: " + range);
	}
}
