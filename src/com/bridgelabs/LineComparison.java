/****************************************************************
 * Purpose :To compute line comparison program using oops concept.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class LineComparison {

	/* Method to find the length of line. */
	public static double findLength(int x1, int x2, int y1, int y2) {

		double lenght_of_line = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
		return lenght_of_line;
	}

	/* Method to compare two lines */
	public static void compareTo(double line1, double line2) {

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

		System.out.println("Enter co-ordinates for first line");
		System.out.println("Enter value of X1 co-ordinate");
		int x1 = sc.nextInt();
		System.out.println("Enter value of X2 co-ordinate");
		int x2 = sc.nextInt();
		System.out.println("Enter value of Y1 co-ordinate");
		int y1 = sc.nextInt();
		System.out.println("Enter value of Y2 co-ordinate");
		int y2 = sc.nextInt();

		System.out.println("Enter co-ordinates for second line");
		System.out.println("Enter value of a1 co-ordinate");
		int a1 = sc.nextInt();
		System.out.println("Enter value of a2 co-ordinate");
		int a2 = sc.nextInt();
		System.out.println("Enter value of b1 co-ordinate");
		int b1 = sc.nextInt();
		System.out.println("Enter value of b2 co-ordinate");
		int b2 = sc.nextInt();

		/* Calling methods to find length and compare two lines. */
		double line1 = findLength(x1, x2, y1, y2);
		System.out.println("Length of line 1 is " + line1);

		double line2 = findLength(a1, a2, b1, b2);
		System.out.println("Length of line 2 is " + line2);

		compareTo(line1, line2);
		sc.close();

	}

}
