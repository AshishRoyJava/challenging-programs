/**
 * 
 */
package problems.basic.programs;

import java.util.Scanner;

/**
 * Java program to print a rectangle using stars (java pattern program)
 * 
 * @author Mrityunjay 21-Sep-2018 4:28:22 PM
 *
 */
public class PrintRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int l, b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length:");
		l = sc.nextInt();
		System.out.println("\nEnter breadth:");
		b = sc.nextInt();

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < b; j++) {
				if (i == 0 || i == (l - 1) || j == 0 || j == (b - 1)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println("\n");
		}

		sc.close();
	}

}
