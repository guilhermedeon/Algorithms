package search.crystalSearch;

import search.Search;

public class CrystalSearchImpl implements Search{
	//iterations = option for counting iterations done each time
	//broken balls = search online for two "crystal balls problem"

	public int crystalSearch(int[] myArray, int myTarget) {
		int jumpSize = (int) Math.floor(Math.sqrt(myArray.length));
		int result = -1;
		int iterations = 0;
		int brokenBalls = 0;

		int index = 0;
		int aux = index;

		while(index <= myArray.length) {
			if (myTarget > myArray[myArray.length-1] || myTarget < myArray[0]) {
				iterations++;
				break;
			}
			else if (myArray[index] == myTarget) {
				iterations++;
				brokenBalls++;
				result = index;
				break;
			}else if (myArray[index] > myTarget) {
				brokenBalls++;
				for (int i = aux; i < index; i++) {
					iterations++;
					if (myArray[i] == myTarget) {
						result = i;
						brokenBalls++;
						break;
					}
				}
				break;
			}else {
				iterations++;
				aux = index;
				index += jumpSize;
				if (index >= myArray.length) {
					index = myArray.length-1;
				}
			}
		}

		System.out.println("Iterations = " + iterations);
		System.out.println("Broken balls = " + brokenBalls );
		return result;
	}

	public int search(int[]array, int targetValue) {
		return crystalSearch(array,targetValue);
	}

	public String toString() {
		return "Crystal Search";
	}

}
