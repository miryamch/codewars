package codewars.challenge3;

public class SmallestIntegerFinder {

	public static int findSmallestInt(int[] inputArray) {
		int smallest = Integer.MAX_VALUE; 
		
		for (int i = 0; i < inputArray.length; i++) {
			if (smallest >= inputArray[i]) {
				smallest = inputArray[i]; 
			}
		}

		return smallest;
	}

}
