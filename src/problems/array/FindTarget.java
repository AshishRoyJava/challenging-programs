/**
 * 
 */
package problems.array;

import java.util.Scanner;

/**
 * @author Mrityunjay 11-May-2018 6:00:01 PM
 *
 */
public class FindTarget {

	public String returnIndex(int array[], int size, int number) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] + array[j] == number) {
					return i + " " + j;
				}
			}
		}
		return "";
	}

	public static void main(String ar[]) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int array[] = new int[size];
		int number;
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		number = scan.nextInt();
		FindTarget rindex = new FindTarget();
		System.out.println(System.currentTimeMillis());
		String index = rindex.returnIndex(array, size, number);
		System.out.println(index);
		System.out.println(System.currentTimeMillis());
		scan.close();
	}

}
