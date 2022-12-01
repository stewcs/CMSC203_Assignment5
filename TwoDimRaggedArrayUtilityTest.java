import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Junit test by Daniel Xu

class TwoDimRaggedArrayUtilityTest {

	
	TwoDimRaggedArrayUtility test = new TwoDimRaggedArrayUtility();
	// this double ragged array is an exact copy of the text file "district3" in the assignment5 provided txt files.
	double[][] arr = { 
			 {1.65, 4.50, 2.36, 7.45, 3.44, 6.23},
			 {2.22, -3.24, -1.66, -5.48, 3.46},
			 {4.23, 2.29, 5.29},
			 {2.76, 3.76, 4.29, 5.48, 3.43},
			 {3.38, 3.65, 3.76},
			 {2.46, 3.34, 2.38, 8.26, 5.34}
		   };
	
	
	
	@BeforeEach
	void setUp() throws Exception {

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetAverage() {
		double info = test.getAverage(arr);
		assertEquals(3.149259259259259, info);
	}

	@Test
	void testGetColumnTotal() {
		double info = test.getColumnTotal(arr, 0);
		assertEquals(16.700000000000003, info);
	}

	@Test
	void testGetHighestInArray() {
		double info = test.getHighestInArray(arr);
		assertEquals(8.26, info);
	}

	@Test
	void testGetHighestInColumn() {
		double info = test.getHighestInColumn(arr, 2);
		assertEquals(5.29, info);
	}
 
	@Test
	void testGetHighestInRow() {
		double info = test.getHighestInRow(arr, 1);
		assertEquals(3.46, info);
	}

	@Test
	void testGetHighestInRowIndex() {
		double info = test.getHighestInRowIndex(arr, 0);
		assertEquals(3, info);
	}

	@Test
	void testGetLowestInArray() {
		double info = test.getLowestInArray(arr);
		assertEquals(-5.48, info);
	}

	@Test
	void testGetLowestInColumn() {
		double info = test.getLowestInColumn(arr, 1);
		assertEquals(-3.24, info);
	}

	@Test
	void testGetRowTotal() {
		double info = test.getRowTotal(arr, 2);
		assertEquals(11.81, info);
	}

	@Test
	void testGetTotal() {
		double info = test.getTotal(arr);
		assertEquals(85.03, info);
	}


	@Test
	void testGetLowestInRowIndex() {
		double info = test.getLowestInRowIndex(arr, 1);
		assertEquals(3, info);
	}

	@Test
	void testGetHighestInColumnIndex() {
		double info = test.getHighestInColumnIndex(arr, 2);
		assertEquals(2, info);
	}

	@Test
	void testGetLowestInColumnIndex() {
		double info = test.getLowestInColumnIndex(arr, 1);
		assertEquals(1, info);
	}
	

}
