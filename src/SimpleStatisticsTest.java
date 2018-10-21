import name.ilhan.SimpleStatistics;

import static org.junit.jupiter.api.Assertions.*;

class SimpleStatisticsTest {

	@org.junit.jupiter.api.Test
	void getMinimum() {
	}

	@org.junit.jupiter.api.Test
	void getMaximum() {
		double dataSet[] = {8.7, 1.01, 2.1, 5.02};
		double max = new SimpleStatistics().getMaximum(dataSet);
		assertEquals(8.7, max);
	}

	@org.junit.jupiter.api.Test
	void getRange() {
		double dataSet[] = {8.7, 1.01, 2.1, 5.02};
		double range = new SimpleStatistics().getRange(dataSet);
		assertEquals(7.69, range, 0.0001);
	}

	@org.junit.jupiter.api.Test
	void getCount() {
		double dataSet[] = {8.7, 1.01, 2.1, 5.02};
		double count = new SimpleStatistics().getCount(dataSet);
		assertEquals(4, count);
	}
}
