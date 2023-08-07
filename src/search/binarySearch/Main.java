package search.binarySearch;

public class Main {

	public static void main(String[] args) {
		BinarySearchImpl bs = new BinarySearchImpl();
		int[] myArray = {0,1,2,3,4,5,6,7,8,9};
		String myArrayString = "";
		for (int i : myArray) {
			myArrayString += i + ", ";
		}
		
		int myTarget = 5;
		
		System.out.println("\nBinary Search: ");
		int resultPosition = bs.binarySearch(myArray, myTarget);
		System.out.println("Array = "
							+ myArrayString 
							+ "\t\t- myTarget = "
							+ myTarget
							+ "\t\t- found position = "
							+ resultPosition);
	}

}
