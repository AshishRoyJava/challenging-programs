/**
 * 
 */
package problems.array;

/**
 * 
 * Algorithm to reverse an array
 * 
 * @author Mrityunjay 05-Sep-2018 3:59:07 PM
 *
 */
public class ReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = { 2, 4, 5, 3, 9, 8, 7, 0, -4, 5 };

		int left = 0, right = arr.length - 1;

		// Printing original array
		System.out.println("Original Array:");
		for (int arrEle : arr) {
			System.out.print(arrEle + " ");
		}

		// Iterating over array from left and right side.
		while (left < right) {

			// Swapping element
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;

		}

		// Printing resultant array
		System.out.println("\nResultant array after reversal:");
		for (int arrEle : arr) {
			System.out.print(arrEle + " ");
		}

	}

}
