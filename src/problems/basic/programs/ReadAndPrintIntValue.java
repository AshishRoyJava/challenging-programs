/**
 * 
 */
package problems.basic.programs;

import java.util.Scanner;

/**
 * How to read and print an integer value in Java?.
 * 
 * @author Mrityunjay 21-Sep-2018 3:21:59 PM
 *
 */
public class ReadAndPrintIntValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Entered number is : " + x);

		sc.close();
	}

}
