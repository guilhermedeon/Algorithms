package search.linearSearch;

import search.Search;

public class LinearSearchImpl implements Search{

	//iterations = option for counting iterations done each time
	
	public int linearSearch(int[] myArray, int myTarget) {
		int result = -1;
		int iterations = 0;
		for(int i = 0; i < myArray.length; i++) {
			iterations++;
			if (myArray[i] == myTarget) {
				result = i;
				break;
			}
		}
		System.out.println("Iterations = " + iterations);
		return result;
	}
	
	public int search(int[]array, int targetValue) {
		return linearSearch(array,targetValue);
	}
	
	public String toString() {
		return "Linear Search";
	}

}
