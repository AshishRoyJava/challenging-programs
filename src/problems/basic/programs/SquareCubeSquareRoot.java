/**
 * 
 */
package problems.basic.programs;

import java.util.Scanner;

/**
 * Java Program to find square, cube and square root of a given number.
 * 
 * @author Mrityunjay 21-Sep-2018 3:45:34 PM
 *
 */
public class SquareCubeSquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		System.out.println("Square of the number is: " + (int) Math.pow(num, 2));
		System.out.println("Cube of the number is: " + (int) Math.pow(num, 3));
		System.out.println("Square root of the number is: " + Math.sqrt(num));

		sc.close();

	}

}
