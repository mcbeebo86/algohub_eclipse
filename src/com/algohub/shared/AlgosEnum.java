package com.algohub.shared;

import java.lang.String;

public enum AlgosEnum {
	
	AnagramsTest("AnagramsTest"),
	SubstringTest("SubstringTest"),
	AlternatingIntsTest("AlternatingIntsTest");
		
	private String algoName;
	
	private AlgosEnum (String s)
	{
		algoName = s;
	}
	
	public String getAlgoName()
	{
		return algoName;
	}
}
