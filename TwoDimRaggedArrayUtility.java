/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: This class has utility methods for the TwoDimRaggedArray.
 * Due: 11/29/2022
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Daniel Xu
 */



import java.io.*;
import java.util.*;


public class TwoDimRaggedArrayUtility {

	/**
	 * Returns the average of the elements in the two dimensional array
	 * @param data | the ragged array to be passed in.
	 * @return average | the average of all elements in the ragged array.
	 **/
	public static double getAverage(double[][] data) {

		double total = 0; // hold sum
		int amount = 0; // total number of elements
		double average;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				total += data[i][j];
				amount += 1; 
			}
		}

		average = (total/amount); // return average.
		return average;
	}


	/** 
	 * Returns the total of the selected column in the two dimensional array index 0 refers to the first column.
	 * @param data | the ragged array to be passed in.
	 * @param col | the specified column.
	 * @return total | the sum of all elements in the column.
	 **/
	public static double getColumnTotal(double[][] data, int col) {
		double total = 0; // hold total of row.

		for (int i = 0; i < data[col].length; i++)
			total += data[i][col]; 


		return total;
	}


	/** 
	 * Returns the largest element in the two dimensional array
	 * @param data | the ragged array to be passed in.
	 * @return highest | the highest element in the entire array.
	 **/
	public static double getHighestInArray(double[][] data) {


		double highest = data [0][0]; // hold highest value

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++)
				if (data[i][j] > highest) // compare and swap
					highest = data[i][j];
		}

		return highest;


	}

	/**
	 *  Returns the largest element of the selected column in the two dimensional array index 0 refers to the first column.
	 * @param data | the ragged array to be passed in.
	 * @param col | the specified column.
	 * @return highest | the highest element of the selected column.
	 */

	public static double getHighestInColumn(double[][] data, int col) {

		double highest = data[0][col];


		for (int i = 0; i < data[col].length;i++)
			if (data[i][col] > highest) // compare and swap
				highest = data[i][col];


		return highest;
	}



	/**
	 *  Returns the largest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data | the ragged array to be passed in.
	 * @param row | the specified row.
	 * @return highest | the largest element of the selected row.
	 */
	public static double getHighestInRow(double[][] data, int row) {
		double highest = data[row][0];


		for (int i = 0; i < data[row].length;i++)
			if (data[row][i] > highest) // compare and swap
				highest = data[row][i];


		return highest;
	}
	/**
	 * Returns the index of the largest element of the selected row in the two dimensional array.
	 * @param data | the ragged array to be passed in.
	 * @param row | the specified row.
	 * @return index | the index of the largest element in the specified row.
	 */
	public static double getHighestInRowIndex(double[][] data, int row) {
		double highest = 0;
		double index = 0;

		for (int i = 0; i < data[row].length;i++) {
			if (data[row][i] > highest) { // compare and swap
				highest = data[row][i];
				index = i;
			}

		}
		return index;
	}


	/**
	 *  Returns the smallest element in the two dimensional array
	 * @param data | the ragged array to be passed in.
	 * @return lowest | the lowest element in the array.
	 */
	public static double getLowestInArray(double[][] data) {
		double lowest = data[0][0];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[i].length; j++)
				if(data[i][j]< lowest)
					lowest = data[i][j];
		return lowest;
	}

	/**
	 *  Returns the smallest element of the selected column in the two dimensional array. index 0 refers to the first column.
	 * @param data | the ragged array to be passed in.
	 * @param col | the specified column.
	 * @return smallestColumn | returns the smallest element in the specified column.
	 */
	public static double getLowestInColumn(double[][] data, int col) {

		double smallestColumn = data[0][col]; // locate specified column

		int i = 0;

		if (col <= data[i].length-1) // passed column is valid.
			for(i = 0; i < data.length; i++) // loop through array
				if(data[i][col] < smallestColumn) // compare
					smallestColumn = data[i][col]; 

		return smallestColumn;
	}


	/**
	 *  Returns the total of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data | the ragged array to be passed in.
	 * @param row | the specified row.
	 * @return total | the total of all elements in the specified row.
	 */
	public static double getRowTotal(double [][] data, int row) {

		double total = 0; // hold total of row.

		for (int i = 0; i < data[row].length; i++)
			total += data[row][i]; 


		return total;

	}

	/**
	 *  Returns the total of all the elements of the two dimensional array
	 * @param data | the ragged array to be passed in.
	 * @return total | the total of all elements in the array
	 */
	public static double getTotal(double[][] data) {

		// hold sum
		double total = 0;

		// loop through array
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++)
				total += data[i][j];
		}

		return total; 

	}

	/**
	 * 
	 * Reads from a file and returns a ragged array of doubles 
	 * The maximum rows is 10 and the maximum columns for each row is 10 
	 * Each row in the file is separated by a new line Each element in the row is separated by a space 
	 * Suggestion: You need to know how many rows and how many columns there are for each row to create a ragged array.
	 * @param f | the file to be read from
	 * @return arr | the newly created ragged array
	 * 
	 **/
	public static double[][] readFile(File f) throws FileNotFoundException{

		try {

			Scanner input = new Scanner(f); // open file for reading.

			double[][] arr = new double[10][10]; 

			for (int i = 0; input.hasNextLine(); i++) {

				String currentLine = input.nextLine(); // Store current line
				String[] splitLine = currentLine.split(" "); // remove whitespace and add to array

				for (int j = 0; j < splitLine.length; j++) // loop through the column

					arr[i][j] = Double.parseDouble(splitLine[j]); // set element equal to column.


			}
			input.close();
			return arr;

		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return null;


	}

	/**
	 *  Writes the ragged array of doubles into the file.
	 * @param data | the ragged array to be passed in.
	 * @param f | the file to be copied.
	 */
	public static void writeToFile(double[][] data, File f) {

		try 
		{
			PrintWriter output = new PrintWriter(new FileWriter(f));
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[i].length; j++)
					output.print(data[i][j] + " ");
				System.out.println();
				output.close();
			} 

		} catch (IOException e) {
			e.printStackTrace();
		}
	}





	/**
	 *  Returns the index of the lowest element in the specified row.
	 * @param data | the ragged array to be passed in.
	 * @param row | the specified row
	 * @return index | the index of the lowest element in the specified row.
	 */
	public static double getLowestInRowIndex(double[][] data, int row) {
		double lowest = 0;
		double index = 0;


		for (int i = 0; i < data[row].length;i++)
			if (data[row][i] < lowest) { // compare and swap
				lowest = data[row][i];
				index = i;
			}
		return index;

	}


	/**
	 *  Returns the index of the highest element in the specified column.
	 * @param data | the ragged array to be passed in.
	 * @param col | the specified column
	 * @return index | the index of the highest element in the specified column.
	 */
	public static double getHighestInColumnIndex(double[][] data, int col) {

		double index = 0, highest = 0;

		for (int row = 0; row < data.length; row++) { // loop through each row of the column
			if(col < data[row].length && data[row][col] > highest) { // Make sure cell exists
				highest = data[row][col]; // swap current highest if current location is higher
				index = row; // set index 
			}
		}

		return index;
	}


	/**
	 *  Returns the index of the lowest element in the specified column
	 * @param data | the ragged array to be passed in.
	 * @param col | the specified column 
	 * @return index | Returns the index of the lowest element in the specified column
	 */
	public static double getLowestInColumnIndex(double[][] data, int col) {

		double index = 0, lowest = data[0].length; // set lowest to first element.


		for (int row = 0; row < data.length; row++) { // loop through each row of the column
			if(col < data[row].length && data[row][col] < lowest) { // Make sure cell exists
				lowest = data[row][col]; // swap current highest if current location is lower
				index = row; // set index 


			}


		}
		return index;

	}
}




