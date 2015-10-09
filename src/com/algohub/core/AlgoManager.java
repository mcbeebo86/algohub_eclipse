package com.algohub.core;

import com.algohub.core.StringAlgos.Anagrams;
import com.algohub.shared.AlgosEnum;

public class AlgoManager {
	public AlgoManager(){}

	public String processAlgo(AlgosEnum algoName)
	{
		//TODO
		switch (algoName) {
			case AnagramsTest:
				return Anagrams.anagramTest();
		default:
				return "";
		}
	}
}
