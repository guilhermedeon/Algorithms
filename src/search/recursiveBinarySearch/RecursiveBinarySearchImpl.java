package search.recursiveBinarySearch;

import search.Search;

public class RecursiveBinarySearchImpl implements Search{
	//iterations = option for counting iterations done each time
	
	public int recursiveBinarySearch(int[] array, int targetValue, int low, int high) {
		if (low <= high) {
			int mid = (high + low) / 2;
			if (array[mid] == targetValue) {
				return mid;
			} else if (array[mid] > targetValue) {
				return recursiveBinarySearch(array,targetValue,low,mid-1);
			} else {
				return recursiveBinarySearch(array,targetValue,mid+1,high);
			}
		}
		return -1;
	}
	
	public int search(int[]array, int targetValue) {
		return recursiveBinarySearch(array, targetValue, 0, array.length-1);
	}
	
	public String toString() {
		return "Recursive Binary Search";
	}
}