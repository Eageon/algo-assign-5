package com.junyu.algorithm.assign5;

import java.util.LinkedList;

public class SeparateChainingHashtable {
	private LinkedList<Integer>[] chainList;
	private int tableSize;
	public static final int DEFAULT_HASHTABLE_SIZE = 17;

	public SeparateChainingHashtable(int size) {
		tableSize = size;
		chainList = new LinkedList[tableSize];
		for(int i = 0; i < chainList.length;i++) {
			chainList[i]=new LinkedList<>();
		}
	}
	
	public SeparateChainingHashtable() {
		this(DEFAULT_HASHTABLE_SIZE);
	}
	
	public static int hash(int value) {
		int hashVal = 0;
		
		
		return 0;
	}
}
