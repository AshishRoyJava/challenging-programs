/**
 * 
 */
package problems.basic.programs;

import java.util.Scanner;

/**
 * Java program to check whether input number is EVEN or ODD.
 * 
 * @author Mrityunjay 21-Sep-2018 3:54:16 PM
 *
 */
public class CheckEvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check even or odd:");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Even number!");
		} else {
			System.out.println("Odd number!");
		}

		sc.close();
	}

}
