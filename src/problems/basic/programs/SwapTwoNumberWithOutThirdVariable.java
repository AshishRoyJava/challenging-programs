/**
 * 
 */
package problems.basic.programs;

import java.util.Scanner;

/**
 * Java program to swap two numbers with and without using third variable.
 * 
 * @author Mrityunjay 21-Sep-2018 3:58:00 PM
 *
 */
public class SwapTwoNumberWithOutThirdVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 value:");
		num1 = sc.nextInt();
		System.out.println("\nEnter num2 value:");
		num2 = sc.nextInt();

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("\nAfter swapping value will be num1: " + num1 + " and num2: " + num2);
		sc.close();
	}

}
