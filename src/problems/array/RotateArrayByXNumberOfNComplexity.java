/**
 * 
 */
package problems.array;

/**
 * @author Mrityunjay 05-Sep-2018 6:09:48 PM
 *
 */
public class RotateArrayByXNumberOfNComplexity {

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = { 4, 3, 7, 5, 1, 8, 2 };
		int d = 9;
		int i, j, k, temp;
		System.out.print("Original array:");
		for (int l : arr) {
			System.out.print(l + " ");
		}
		if (d >= arr.length) {
			d %= arr.length;
		}
		for (i = 0; i < gcd(d, arr.length); i++) {
			temp = arr[i];
			j = i;

			while (true) {
				k = j + d;
				if (k >= arr.length) {
					k = k - arr.length;
				}
				if (k == i) {
					break;
				}

				arr[j] = arr[k];
				j = k;
			}

			arr[j] = temp;
		}

		System.out.print("\nAfter rotation:");
		for (int l : arr) {
			System.out.print(l + " ");
		}

	}

}
