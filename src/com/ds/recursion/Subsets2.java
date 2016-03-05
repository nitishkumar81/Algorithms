package com.ds.recursion;

import java.util.ArrayList;

public class Subsets2 {
	public static ArrayList<ArrayList<Integer>> subsets(int[] a) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result.add(new ArrayList<Integer>());
		// Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {
			int curSize = result.size();
			for (int j = 0; j < curSize; j++) {
				ArrayList<Integer> current = new ArrayList<Integer>(result.get(j));
				current.add(a[i]);

				result.add(current);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(subsets(new int[] { 1, 3, 2 }));
	}
}
