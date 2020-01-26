package com.montarelo.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class ClassDos {
	public static int[] findTwoSum(int[] list, int sum) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < list.length; i++) {
			int req = sum - list[i];
			if (map.get(req) != null)
				return new int[] { i, map.get(req) };

			map.put(list[i], i);
		}

		return null;
	}

	public static void main(String[] args) {
		int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
		if (indices != null) {
			System.out.println(indices[0] + " " + indices[1]);
		}
	}
}
