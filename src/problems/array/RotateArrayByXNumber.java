/**
 * 
 */
package problems.array;

/**
 * Algorithm to rotate array of size 'n' by 'd' elements
 * 
 * @author Mrityunjay 05-Sep-2018 4:10:42 PM
 *
 */
public class RotateArrayByXNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int d = 4;
		int arr[] = { 5, 2, 8, 3, 9, 1, 6 };

		for (int i = 0; i < d; i++) {

			int temp = arr[0];

			for (int j = 0; j < arr.length - 1; j++) {

				// Shifting element position by one.
				arr[j] = arr[j + 1];

			}

			arr[arr.length - 1] = temp;
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
