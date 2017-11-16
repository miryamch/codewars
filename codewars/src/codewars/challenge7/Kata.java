package codewars.challenge7;

public class Kata {

	public static int[] sortArray(int[] input) {
		int iSmallest = 0; 
		
		for (int i = 0; i < input.length; i++) {
			int currentVal = input[i]; 
			if(isOdd(currentVal) && currentVal < input[iSmallest]) {
				// substitution 
				int tmp = input[i];
				input[i] = input[iSmallest]; 
				input[iSmallest] = tmp; 				
				// update smallest 
				iSmallest = i; 
			}			
		}		
		System.out.println(input.toString());
		return input; 
	}

	public static boolean isOdd(int number) {
		return (number % 2) > 0;
	}

}
