/****************************************************************
 * Purpose :To compute line comparison program using oops concept.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class LineComparison {

	/* Method to find the length of line. */
	public double findLength(int x1, int x2, int y1, int y2) {

		double lenght_of_line = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
		return lenght_of_line;
	}

	/* Method to compare two lines */
	public void compareTo(double line1, double line2) {

		if (line1 == line2)
			System.out.println("Two lines are equal");
		else if (line1 > line2)
			System.out.println("Two lines are not equal and length of Line 1 is greater than line 2");
		else
			System.out.println("Two lines are not equal and length of Line 2 is greater than line 1");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line comparison Computation program");

		/* Taking user input for coordinates of two lines */
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter line 1 coordinates: x1, x2, y1, y2");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();

		System.out.println("Enter line 2 coordinates: a1, a2, b1, b2");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();

		LineComparison lineCompare = new LineComparison();

		/* Calling methods to find length and compare two lines. */
		double lengthOfLine1 = lineCompare.findLength(x1, x2, y1, y2);
		System.out.println("Length of line 1 is " + lengthOfLine1);

		double lengthOfLine2 = lineCompare.findLength(a1, a2, b1, b2);
		System.out.println("Length of line 2 is " + lengthOfLine2);

		lineCompare.compareTo(lengthOfLine1, lengthOfLine2);
		sc.close();

	}

}
