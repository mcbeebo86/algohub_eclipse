package com.algohub.core.StringAlgos;

import java.util.HashMap; 

public class Anagrams {
	/*
	 * Given 2 strings, str1 and str2, write a function areAnagrams that determines whether the 2 strings are anagrams.
	 * 2 strings are considered anagrams if they have the same letters but not necessarily in the same order.
	 * "mary" vs "army"
	 * */
	
	public static String anagramTest()
	{
		String s1 = "mary";
		String s2 = "army";
		boolean res = Anagrams.areAnagrams(s1,s2);
		
		if (res)
			return s1 + " and " + s2 + " ARE anagrams";
		else
			return s1 + " and " + s2 + " ARE NOT anagrams";
	}
	
	private static boolean areAnagrams(String s1, String s2)
	{
		HashMap<Character,Integer> s1Map = new HashMap<Character,Integer>();
		int i = 0;
		Character cur;
		
		for (i = 0; i < s1.length(); i++){
			cur = s1.charAt(i);
			if (s1Map.containsKey(cur)){
				s1Map.put(cur,s1Map.get(cur) + 1);
			}
			else {
				s1Map.put(cur, 1);
			}
		}
		
		for (i = 0; i < s2.length(); i++){
			cur = s2.charAt(i);
			if (s1Map.containsKey(cur)){
				if (s1Map.get(cur) == 1)
					s1Map.remove(cur);
				else
					s1Map.put(cur,s1Map.get(cur) - 1);
			}
			else {
				return false;
			}
		}
		
		if (s1Map.isEmpty()) return true;
		
		return false;
	}
}
