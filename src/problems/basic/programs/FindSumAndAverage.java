/**
 * 
 */
package problems.basic.programs;

import java.util.Scanner;

/**
 * Java program to find sum and average of two integer numbers.
 * 
 * @author Mrityunjay 21-Sep-2018 3:25:00 PM
 *
 */
public class FindSumAndAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1, num2, sum = 0;
		float avg = 0.0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two number:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sum = num1 + num2;
		System.out.println("Sum of two number is: " + sum);
		avg = (float) sum / 2;

		System.out.println("Average : " + avg);

		sc.close();
	}

}
