/**
 * 
 */
package problems.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the number occurring odd number of times in a given array of size 'n'
 * 
 * @author Mrityunjay 05-Sep-2018 3:30:30 PM
 *
 */
public class FindOddNumberOfTimesOccurring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = { 2, 4, 3, 2, 5, 4, 6, 7, 8, 2, 4, 9, 2 };

		Map<Integer, Integer> mapRef = new HashMap<Integer, Integer>();

		// adding number into map
		for (int i : arr) {
			if (mapRef.get(i) != null) {
				mapRef.put(i, mapRef.get(i) + 1);
			} else {
				mapRef.put(i, 1);
			}
		}

		// Iterating over map elements.
		for (Map.Entry<Integer, Integer> mapObj : mapRef.entrySet()) {
			int x = mapObj.getValue();
			if (x % 2 != 0) {
				System.out.println("Number is : " + mapObj.getKey());
			}
		}

	}

}
