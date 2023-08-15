package sort.selectionSort;

import sort.Sort;

public class SelectionSortImpl implements Sort{
	
	@Override
	public int[] sort(int[] myArray) {
		for(int i = 0; i < myArray.length ; i++) {
			for (int j = i; j < myArray.length; j++) {
				if (i != j) {
					if (myArray[j] < myArray[i]) {
						int aux = myArray[j];
						myArray[j] = myArray[i];
						myArray[i] = aux;
					}
				}
			}
		}
		return myArray;
	}
	
	public String toString() {
		return "Selection Sort";
	}
	
}
