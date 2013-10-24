package com.junyu.algorithm.assign5;

import java.util.ArrayList;

public class DoubleHashingHashtable {
	private ArrayList<Integer> cellList;

	private int tableSize;
	public static final int DEFAULT_HASHTABLE_SIZE = 17;

	public DoubleHashingHashtable() {
		this(DEFAULT_HASHTABLE_SIZE);
	}

	public DoubleHashingHashtable(int size) {
		cellList = new ArrayList<Integer>(size);
	}

	private int hash1(int value) {
		return value % tableSize;
	}

	private int hash2(int value) {
		return value % 7 + 1;
	}
}
