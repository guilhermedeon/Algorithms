package search.binarySearch;

import search.Search;

public class BinarySearchImpl implements Search{
	//iterations = option for counting iterations done each time
	
	public int binarySearch(int[] array, int targetValue) {
		int low = 0, result = -1;
		int high = array.length - 1;
		int iterations = 0;
		
		while(low <= high) {
			iterations++;
			int mid = (high + low) / 2;
			if (array[mid] == targetValue) {
				result = mid;
				break;
			}
			else if (array[mid] < targetValue) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println("Iterations = " + iterations);
		return result;
	}
	
	public int search(int[]array, int targetValue) {
		return binarySearch(array,targetValue);
	}
	
	public String toString() {
		return "Binary Search";
	}
}