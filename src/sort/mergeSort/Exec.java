package sort.mergeSort;

import sort.Sort;

public class Exec {
	public static void main(String[] args) {
		Sort mergeSort = new MergeSortImpl();
		//int[] myArray = {9,8,7,6,5,4,3,2,1};
		int[] myArray = {4,3,2,1,10,55};
		myArray = mergeSort.sort(myArray);
		System.out.println("--------");
		for (int i : myArray) {
			System.out.println(i);
		}
	}
}
