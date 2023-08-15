package search;
import java.util.ArrayList;

import search.binarySearch.BinarySearchImpl;
import search.crystalSearch.CrystalSearchImpl;
import search.linearSearch.LinearSearchImpl;
import search.recursiveBinarySearch.RecursiveBinarySearchImpl;

public class SearchExec {
	//class for executing and testing

	public static void main(String[] args) {
		int listSize = 9;
		int myTarget = 4;
		
		int[] myArray = new int[listSize];
		//ArrayList<Integer> myList = new ArrayList<>();
		
		for (int i = 0; i < listSize; i++) {
			//myList.add(i);
			myArray[i] = i;
		}

		ArrayList<Search> searchAlgos = new ArrayList<>();
		Search linearSearch = new LinearSearchImpl();
		Search crystalSearch = new CrystalSearchImpl();
		Search binarySearch = new BinarySearchImpl();
		Search recBinarySearch = new RecursiveBinarySearchImpl();
		searchAlgos.add(linearSearch);
		searchAlgos.add(binarySearch);
		searchAlgos.add(crystalSearch);
		searchAlgos.add(recBinarySearch);
	
		
		for(Search s : searchAlgos) {
			System.out.println(s.toString());
			long initialTime = System.nanoTime();
			int resultPosition = s.search(myArray, myTarget);
			long finalTime = System.nanoTime();
			System.out.println(   "Array = 0 to "
								+ String.valueOf(listSize - 1)
								+ "\nmyTarget = "
								+ myTarget
								+ "\nFound position = "
								+ resultPosition
								+ "\nTime taken: "
								+ String.valueOf(finalTime - initialTime)
								+ "ns\n");
		}
	}

}