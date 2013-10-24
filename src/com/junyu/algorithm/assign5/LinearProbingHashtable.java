package com.junyu.algorithm.assign5;

import java.util.ArrayList;
import java.util.Iterator;

public class LinearProbingHashtable {

	private ArrayList<Integer> cellList;

	private int tableSize;
	public static final int DEFAULT_HASHTABLE_SIZE = 17;

	public LinearProbingHashtable() {
		this(DEFAULT_HASHTABLE_SIZE);
	}

	public LinearProbingHashtable(int size) {
		cellList = new ArrayList<>(tableSize);
		for (int i = 0; i < tableSize; i++) {
			cellList.set(i, null);
		}
	}

	private int hash(int value) {
		return value % tableSize;
	}

	private int hash(int i, int value) {
		int fi = i;
		return (hash(value) + fi) % tableSize;
	}

	public void insert(int value) {
		int hashVal = hash(value);

		for (int i = 0; i < tableSize; i++) {
			hashVal = (hashVal) + i % tableSize;
			if (cellList.get(hashVal) == null) {
				cellList.set(hashVal, value);
				break;
			}
		}
	}

	public void showTable() {
		for (int i = 0; i < cellList.size(); i++) {
			System.out.println("Cell " + i + ": " + cellList.get(i));
		}
	}
}
