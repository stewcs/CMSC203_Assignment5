/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: This class has two methods which calculate the holiday bonus for the ragged array.
 * Due: 11/29/2022
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Daniel Xu
 */



public class HolidayBonus extends TwoDimRaggedArrayUtility {


	/**
	 * This program calculates the holiday bonuses of each store. 
	 * The store with the highest value in a column gets 5000.
	 * The store with the lowest value in a column gets 1000.
	 * A store with a negative number or with no entry in that column, receives nothing.
	 * All other stores get 2000.
	 * @param data | the 2D ragged array to be passed in
	 * @return report | a 1D array that has the holiday bonuses for each store
	 */
	static double[] calculateHolidayBonus(double[][] data) {

		double[] report = new double[data.length]; // Array to store the result
		double highestIndex = 0; // to store index of highest store, we use this index when adding to the 1D array
		double lowestIndex = 0; // to store index of lowest store, we use this index when adding to the 1D array
		

		// Find length of longest row.
		int maxColumns = data[0].length; //initialize to length of first row
		for(int i = 0; i < data.length; i++) // go through each row.
			if(maxColumns < data[i].length) // compare if this row has more columns than current max
				maxColumns = data[i].length; // swap


		for (int col = 0; col < maxColumns; col++) { // go up and down
			for (int row = 0; row < maxColumns; row++) {

				highestIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col); // get index of store with highest	
				lowestIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col); // get index of store with lowest

				
				if(col < data[row].length) // make sure the cell exists
					if(highestIndex == row) 
						report[row] += 5000; // add 5000 to the corresponding store's index in the 1D array
					else if(lowestIndex == row)
						report[row] += 1000; // add 1000 to the corresponding store's index in the 1D array
					else if(data[row][col] <= 0) 
						report[row] += 0;    // add nothing to any store with a column value that is negative or empty
					else 
						report[row] += 2000; // add 2000 to the stores with columns that are not highest or lowest.


			}

		}

		return report;

	}




	static double calculateTotalHolidayBonus(double[][] data) {

		double total = 0;

		double[] totalArr = calculateHolidayBonus(data);
		for(int index = 0; index < totalArr.length; index++) {
			total += totalArr[index];
		}

		return total;



	}}

