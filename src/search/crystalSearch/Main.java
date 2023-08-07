package search.crystalSearch;

public class Main {

	public static void main(String[] args) {
		CrystalSearchImpl bs = new CrystalSearchImpl();
		int[] myArray = {0,1,2,3,4,5,6,7,8,9};
		String myArrayString = "";
		for (int i : myArray) {
			myArrayString += i + ", ";
		}
		
		int myTarget = 5;
		
		System.out.println("\nCrystal Search");
		int resultPosition = bs.crystalSearch(myArray, myTarget);
		System.out.println("Array = "
							+ myArrayString 
							+ "\t\t- myTarget = "
							+ myTarget
							+ "\t\t- found position = "
							+ resultPosition);
	}

}
