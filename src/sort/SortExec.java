package sort;

import java.util.ArrayList;

import sort.bubbleSort.BubbleSortImpl;

public class SortExec {
	//class for executing and testing
	
	public static void main(String[] args) {
		int size = 10000;
		int[] myArray2 = {11,55,99,88,66,77,32,15,68,4,77};
		//////////////////////////////

		ArrayList<Sort> sortAlgos = new ArrayList<>();
		Sort bubbleSort = new BubbleSortImpl();
		sortAlgos.add(bubbleSort);
		
		////////////////////////////////////
		int[] myArray = new int[size];
		ArrayList<Integer> myList = new ArrayList<>();
		for(int i = size; i > 0; i--) {
			myArray[size-i] = i;
			myList.add(i);
		}		
		/////////////////////////////////////////////
		
		System.out.println("Original Array:");
		System.out.println(myList);
		
		for (Sort s : sortAlgos) {
			long initialTime = System.nanoTime();
			int[] sorted = s.sort(myArray);
			long finalTime = System.nanoTime();
			long timeTaken = finalTime - initialTime;
			print(sorted, s.toString());
			System.out.println("Time taken: " + timeTaken + "ns");
		}
		
		////////////////////////////////////////////////////
		ArrayList<Integer> myList2 = new ArrayList<>();
		for (int i : myArray2) {
			myList2.add(i);
		}
		
		System.out.println("\n\nOriginal Array PT2:");
		System.out.println(myList2);
		
		for (Sort s : sortAlgos) {
			long initialTime = System.nanoTime();
			int[] sorted2 = s.sort(myArray2);
			long finalTime = System.nanoTime();
			long timeTaken = finalTime - initialTime;
			print(sorted2, s.toString());
			System.out.println("Time taken: " + timeTaken + "ns");
		}
	}

	public static void print(int[] array, String string) {
		ArrayList<Integer> aux = new ArrayList<>();
		for (int i : array) {
			aux.add(i);
		}
		System.out.println("Sorted with " + string);
		System.out.println(aux);
	}
}
