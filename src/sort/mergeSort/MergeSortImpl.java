package sort.mergeSort;

import java.util.Arrays;

import sort.Sort;

public class MergeSortImpl implements Sort{
	
	public int[] mergeSort(int[] array) {
		if (array.length <= 1) {
			
			return Arrays.copyOfRange(array, 0, 1);
		}
		int mid = (array.length)/2;
		int[] left = mergeSort(Arrays.copyOfRange(array, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(array, mid, array.length));
		return merge(left,right);
		
	}
	
	public int[] merge(int[] left, int[] right) {
		int totalLen = left.length + right.length;
		int [] result = new int[totalLen];
		int indexR = 0;
		int indexL = 0;
		for (int i = 0; i < totalLen; i++) {
			if (indexR >= right.length) {
				result[i] = left[indexL];
				indexL++;
			} else if (indexL >= left.length) {
				result[i] = right[indexR];
				indexR++;
			} else {
				if (left[indexL] <= right[indexR]) {
					result[i] = left[indexL];
					indexL++;
				}
				else {
					result[i] = right[indexR];
					indexR++;
				}
			}
		}
		return result;
	}

	@Override
	public int[] sort(int[] myArray) {
		return mergeSort(myArray);
	}
	
	public String toString() {
		return "Merge Sort";
	}

}
