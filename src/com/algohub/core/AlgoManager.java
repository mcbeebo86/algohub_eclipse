package com.algohub.core;

import com.algohub.core.StringAlgos.Anagrams;
import com.algohub.shared.AlgosEnum;

public class AlgoManager {
	//private static volatile AlgoManager _mgr = new AlgoManager();
	// VOLATILE makes sure the constructor is fully executed before allowing others to work with the object
	private static volatile AlgoManager _mgr; 
	private static final Object lock = new Object();
	private AlgoManager(){}

	public static AlgoManager getManager(){
		if (_mgr == null) {
			synchronized (lock) {
				if (_mgr == null) {
					_mgr = new AlgoManager();					
				}
			}
		}
			
		return _mgr; 
	}
	
	public String processAlgo(AlgosEnum algoName)
	{
		switch (algoName) {
			case AnagramsTest:
				return Anagrams.anagramTest();
		default:
				return "<p>Algorithm has not been implemented yet.</p>";
		}
	}
}
