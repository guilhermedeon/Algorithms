package sort.bubbleSort;

import sort.Sort;

public class BubbleSortImpl implements Sort{
	//iterations = option for counting iterations done each time

	@Override
	public int[] sort(int[] myArray) {
		int iterations = 0;
		if (myArray.length == 0) {
			return null;
		}
		int len = myArray.length;
		for (int i = len ; i > 1; i--) {
			for(int j = 0; j < i-1 ; j++) {
				//optional
				iterations++;
				if (myArray[j] > myArray[j+1]) {
					int aux = myArray[j];
					myArray[j] = myArray[j+1];
					myArray[j+1] = aux;
				}
			}
		}
		System.out.println("Iterations = "+iterations);
		return myArray;
	}
	
	public String toString() {
		return "Bubble Sort";
	}
}
