package search;

import java.util.ArrayList;

import search.binarySearch.BinarySearchImpl;
import search.crystalSearch.CrystalSearchImpl;
import search.linearSearch.LinearSearchImpl;

public class SearchExecSimple {
	//class for executing and testing
	
	public static void main(String[] args) {
		int listSize = 10;
		int myTarget = 2;
		
		int[] myArray = new int[listSize];
		ArrayList<Integer> myList = new ArrayList<>();
		
		for (int i = 0; i < listSize; i++) {
			myList.add(2);
			myArray[i] = 2;
		}

		ArrayList<Search> searchAlgos = new ArrayList<>();
		Search linearSearch = new LinearSearchImpl();
		Search crystalSearch = new CrystalSearchImpl();
		Search binarySearch = new BinarySearchImpl();
		searchAlgos.add(linearSearch);
		searchAlgos.add(binarySearch);
		searchAlgos.add(crystalSearch);
	
		
		for(Search s : searchAlgos) {
			System.out.println(s.toString());
			int resultPosition = s.search(myArray, myTarget);
			System.out.println(   "Array = 0 to "
								+ myList
								+ "\nmyTarget = "
								+ myTarget
								+ "\nFound position = "
								+ resultPosition
								+ "\n");
		}
	}

}
