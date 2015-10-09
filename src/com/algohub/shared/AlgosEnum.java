package com.algohub.shared;

import java.lang.String;

public enum AlgosEnum {
	
	AnagramsTest("AnagramsTest"),
	SubStringTest("SubStringTest");
		
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
