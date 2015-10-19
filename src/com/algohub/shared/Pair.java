package com.algohub.shared;

public class Pair< E > {
	private E _val1;
	private E _val2;
	
	public Pair (E val1, E val2) {
		_val1 = val1;
		_val2 = val2; 
	}

	public E get_val1() {
		return _val1;
	}

	public void set_val1(E _val1) {
		this._val1 = _val1;
	}

	public E get_val2() {
		return _val2;
	}

	public void set_val2(E _val2) {
		this._val2 = _val2;
	}
	
	
}
