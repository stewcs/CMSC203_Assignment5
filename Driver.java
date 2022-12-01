
public class Driver extends TwoDimRaggedArrayUtility {

	public static void main(String[] args) {
		
		double[][] arr = { 
				 {1.65, 4.50, 2.36,   7.45, 3.44, 6.23},
				 {2.22,-3.24,-1.66,  -5.48, 3.46},
				 {4.23, 2.29, 5.29              },
				 {2.76, 3.76, 4.29,   5.48, 3.43},
				 {3.38, 3.65, 3.76              },
				 {2.46, 3.34, 2.38,   8.26, 5.34}
			   };
		
		
		//System.out.println(TwoDimRaggedArrayUtility.getHighestInColumnIndex(arr, 4));
		double result[] = HolidayBonus.calculateHolidayBonus(arr);
		double total = HolidayBonus.calculateTotalHolidayBonus(arr);
		System.out.println("total bonus is " + total);
		System.out.println(result[2]);
		
		
		
	}

}
