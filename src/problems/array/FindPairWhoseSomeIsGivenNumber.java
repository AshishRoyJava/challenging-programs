package problems.array;

import java.util.HashMap;
import java.util.Map;

// Find a pair in an array of size 'n', whose sum is X

public class FindPairWhoseSomeIsGivenNumber {

	public static void main(String[] args) {

		int num = 13;
		int arr[] = { 3, 5, 8, 9, 12, 2, 14, 20, 0, 7 };
		
		Map<Integer, Boolean> mapRef = new HashMap<Integer, Boolean>();
		for (int i : arr) {
			if(mapRef.get(num - i) != null) {
				System.out.println("Pair: "+ (num - i) + "," + i);
				break;
			} else {
				mapRef.put(i, true);
			}
		}
	}

}
