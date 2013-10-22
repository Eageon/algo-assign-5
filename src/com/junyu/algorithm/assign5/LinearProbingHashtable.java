package com.junyu.algorithm.assign5;

public class LinearProbingHashtable {

	int[] cellList;

	private int tableSize;
	public static final int DEFAULT_HASHTABLE_SIZE = 17;

	public LinearProbingHashtable() {
		this(DEFAULT_HASHTABLE_SIZE);
	}

	public LinearProbingHashtable(int size) {
		cellList = new int[size];
	}

	private int hash(int value) {
		return value % tableSize;
	}

	private int hash(int i, int value) {
		int fi = i;
		return (hash(value) + fi) % tableSize;
	}
	
	public void insert(int value) {
		
	}
}
