package com.junyu.algorithm.assign5;

import java.util.ArrayList;
import java.util.Currency;

public class Heap {

	public static final int DEFAULT_HEAP_SIZE = 17;

	private int[] array;
	private int heapSize = 0;

	public Heap(int size) {

	}

	public Heap() {

	}

	public void buildHeap(int[] rawArray) {
		heapSize = rawArray.length;
		array = new int[heapSize * 2 + 1];

		for (int i = 0; i < rawArray.length; i++) {
			array[i + 1] = rawArray[i];
		}

		for (int i = heapSize / 2, j = 1; i > 0; i--, j++) {
			percolateDown(i);
			if (j % 3 == 0)
				showHeap();
		}
	}

	private void percolateDown(int hole) {
		int child;
		int tmp = array[hole];

		for (; hole * 2 <= heapSize; hole = child) {
			child = hole * 2;
			if (child != heapSize && array[child + 1] < array[child])
				child++;
			if (array[child] < tmp)
				array[hole] = array[child];
			else
				break;
		}
		array[hole] = tmp;
	}

	public int deleteMin() {
		int minItem = array[1];
		array[1] = array[heapSize--];
		percolateDown(1);

		return minItem;
	}

	public void insert(int value) {
		// if(heapSize == array.length -1)

		int hole = ++heapSize;
		for (array[0] = value; value < array[hole / 2]; hole /= 2) {
			array[hole] = array[hole / 2];
		}
		array[hole] = value;
	}

	public void showHeap() {
		for (int i = 1; i <= heapSize; i++)
			System.out.print(array[i] + ", ");
		System.out.println("");
	}

	public static void main(String[] args) {
		int[] A = { 10, 12, 1, 14, 6, 5, 8, 15, 3, 9, 7, 4, 11, 13, 2 };
		Heap heap = new Heap();

		heap.buildHeap(A);
		heap.insert(16);
		heap.showHeap();
		heap.insert(0);
		heap.showHeap();
	}

}
