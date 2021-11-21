package com.alfalahsoftech.jdk8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {
	public static void main(String[] args) {
		HashMap<String, Integer>  m =new HashMap<String, Integer>();
		m.put("A", 1);
		m.put("Q", 9);
		m.put("C", 0);
		m.put("M", 19);
		Map<String, Integer> resultMap = new LinkedHashMap<String, Integer>();
		System.out.println(m);
		m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(hm->resultMap.put(hm.getKey(),hm.getValue()));
		System.out.println(resultMap);


		Map<String, Integer> resultMap2 = new LinkedHashMap<String, Integer>();
		m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(hsm->resultMap2.put(hsm.getKey(),hsm.getValue()));
		System.out.println(resultMap2);
		anotherway();
	}
	public static void anotherway() {

		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("g", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);

		System.out.println("Original...");
		System.out.println(unsortMap);

		// sort by keys, a,b,c..., and return a new LinkedHashMap
		// toMap() will returns HashMap by default, we need LinkedHashMap to keep the order.
		Map<String, Integer> result = unsortMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println("Sorted...");
        System.out.println(result);
	}
}
