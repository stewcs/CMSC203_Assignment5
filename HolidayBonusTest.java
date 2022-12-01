
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class  is my test cases for a HolidayBonus object.
 * 
 * @author Daniel Xu
 * 
 * 
 */
public class HolidayBonusTest {

	double[][] arr = { 
			 {1.65, 4.50, 2.36,   7.45, 3.44, 6.23},
			 {2.22,-3.24,-1.66,  -5.48, 3.46},
			 {4.23, 2.29, 5.29              },
			 {2.76, 3.76, 4.29,   5.48, 3.43},
			 {3.38, 3.65, 3.76              },
			 {2.46, 3.34, 2.38,   8.26, 5.34}
		   };

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateHolidayBonusA() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(arr);
			assertEquals(17000.0, result[0], .001);
			assertEquals(7000.0, result[1], .001);
			assertEquals(12000.0, result[2], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}

	}

	@Test
	public void testCalculateTotalHolidayBonusA() {
		double total = HolidayBonus.calculateTotalHolidayBonus(arr);
		assertEquals(67000.0, HolidayBonus.calculateTotalHolidayBonus(arr), .001);
	}

}
