package problems.array;

import java.util.HashMap;
import java.util.Map;

// Find a majority element in an array of size 'n'

public class FindMajorityElement {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 3, 2, 5, 4, 6, 7, 8, 2, 4, 9, 2 };
		int maxEle = Integer.MIN_VALUE;
		int maxValKey = 0;
		Map<Integer, Integer> mapRef = new HashMap<Integer, Integer>();

		for (int i : arr) {
			if (mapRef.get(i) != null) {
				mapRef.put(i, mapRef.get(i) + 1);
			} else {
				mapRef.put(i, 1);
			}
		}

		for (Map.Entry<Integer, Integer> mapObj : mapRef.entrySet()) {
			int x = mapObj.getValue();
			if (x > maxEle) {
				maxEle = x;
				maxValKey = mapObj.getKey();
			}
		}

		System.out.println("Result: " + maxValKey);
	}

}
