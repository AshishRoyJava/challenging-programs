package com.example.challenges.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayElementSum {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number of elements in Array: ");
			int n = Integer.parseInt(sc.nextLine());
			int[] arr = new int[n];
			System.out.println(n);
			for (int index = 0; index < n; index++) {
				arr[index] = Integer.parseInt(sc.next());
			}
			System.out.println("Enter target value: ");
			int t = Integer.parseInt(sc.next());
			long time = System.currentTimeMillis();
			int[] res = new int[2];
			Map<Integer, Integer> map = new HashMap<>();
			for (int elem : arr) {
				int inv = t - elem;
				if (map.get(inv) == null || map.get(inv) == 0) {
					map.put(elem, elem);
				} else {
					res[0] = inv;
					res[1] = elem;
				}
			}
			for (int i : res) {
				System.out.print(i + "\t");
			}
			System.out.println("Time taken -> " + (System.currentTimeMillis() - time));
		} catch (Exception e) {

		}
		
	}
}
