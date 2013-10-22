package com.junyu.algorithm.assign5;

import java.util.Iterator;
import java.util.LinkedList;

public class SeparateChainingHashtable {
	private LinkedList<Integer>[] chainList;
	private int tableSize;
	public static final int DEFAULT_HASHTABLE_SIZE = 17;

	public SeparateChainingHashtable(int size) {
		tableSize = size;
		chainList = new LinkedList[tableSize];
		for (int i = 0; i < chainList.length; i++) {
			chainList[i] = new LinkedList<>();
		}
	}

	public SeparateChainingHashtable() {
		this(DEFAULT_HASHTABLE_SIZE);
	}

	private int hash(int value) {
		int hashVal = 0;
		hashVal = value % tableSize;
		return hashVal;
	}

	public void insert(int value) {
		LinkedList<Integer> whichList = chainList[hash(value)];

		if (whichList.contains(value)) {
			whichList.add(value);
		}
	}

	public void showTable() {
		for (int i = 0; i < chainList.length; i++) {
			System.out.print("Table " + i + ": ");
			Iterator<Integer> itor = chainList[i].iterator();
			while(itor.hasNext())
				System.out.print(itor.next() + " ");
			System.out.println("");
		}
	}
}
