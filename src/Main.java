public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		double dataSet[] = {8.7, 1.01, 2.1, 5.02};
		double result = new SimpleStatistics().getMinimum(dataSet);
		System.out.println("Minimum: " + result);
	}
}
