package search.recursiveBinarySearch;

public class Main {

	public static void main(String[] args) {
		RecursiveBinarySearchImpl bs = new RecursiveBinarySearchImpl();
		int[] myArray = {0,1,2,3,4,5,6,7,8,9};
		String myArrayString = "";
		for (int i : myArray) {
			myArrayString += i + ", ";
		}
		
		int myTarget = 9;
		
		System.out.println("\nRecursive Binary Search: ");
		int resultPosition = bs.search(myArray, myTarget);
		System.out.println("Array = "
							+ myArrayString 
							+ "\t\t- myTarget = "
							+ myTarget
							+ "\t\t- found position = "
							+ resultPosition);
	}

}
