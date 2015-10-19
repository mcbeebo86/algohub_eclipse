package com.algohub.core.StringAlgos;

import com.algohub.shared.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
	/*
	 * Given 2 strings, str1 and str2, write a function areAnagrams that determines whether the 2 strings are anagrams.
	 * 2 strings are considered anagrams if they have the same letters but not necessarily in the same order.
	 * "mary" vs "army"
	 * */
	
	public static String anagramTest()
	{
		String s1,s2;
		boolean res = false;
		StringBuilder builder = new StringBuilder();
		List<Pair<String>> testBank = new ArrayList<Pair<String>>();
		testBank.add(new Pair<String>("Mother-in-law", "Woman Hitlerr"));
		testBank.add(new Pair<String>("The earthquakes", "That queer shake"));
		testBank.add(new Pair<String>("Debit card", "Bad credit"));
		testBank.add(new Pair<String>("School Master", "The classroom"));
		testBank.add(new Pair<String>("Eleven plus two", "Twelve plus one"));
		testBank.add(new Pair<String>("Dormitory", "Dirty room"));
		testBank.add(new Pair<String>("Punishment", "Nine Thumps"));
		testBank.add(new Pair<String>("Desperation", "A rope ends it"));
		testBank.add(new Pair<String>("The Morse code", "Here come dots"));
		testBank.add(new Pair<String>("a decimal point", "I'm a dot in place"));
		testBank.add(new Pair<String>("Astronomer", "Moon starer"));
		testBank.add(new Pair<String>("mary", "army"));
		testBank.add(new Pair<String>("", "army"));
		testBank.add(new Pair<String>("mary", ""));
		testBank.add(new Pair<String>("mary", "arrmy"));
		
		for (int i = 0; i < testBank.size(); i++)
		{
			s1 = testBank.get(i).get_val1();
			s2 = testBank.get(i).get_val2();
			
			res = Anagrams.areAnagrams(s1,s2);
			
			if (res)
				builder.append(s1 + " and " + s2 + " ARE anagrams.");
			else
				builder.append(s1 + " and " + s2 + " ARE NOT anagrams.");
			
			builder.append("<br />");
		}
		
		return builder.toString();
	}
	
	private static boolean areAnagrams(String s1_input, String s2_input)
	{
		String s1 = s1_input.toLowerCase().replaceAll("[\\s\\-\\']","");
		String s2 = s2_input.toLowerCase().replaceAll("[\\s\\-\\']","");
		
		if ((s1.isEmpty() && !s2.isEmpty())||(!s1.isEmpty() && s2.isEmpty())) return false;
		if (s1.length() != s2.length()) return false;
		
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
		
		if (s1Map.size() == 0) return true;
		
		return false;
	}
}
