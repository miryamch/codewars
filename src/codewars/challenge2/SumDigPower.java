package codewars.challenge2;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {

	public static List<Long> sumDigPow(long a, long b) {
		// get array of values between a and b 
		List<Long> inputArray = new ArrayList<>() ; 
	    for (int i = (int) a; i <= b; ++i) {
	        inputArray.add((long) i); 
	    }
		List<Long> outList = new ArrayList<>(); 
		for (int j = 0; j < inputArray.size()-1; j++) {
			Long num = inputArray.get(j); 
			String numStr = num.toString();
			long sum = 0; 
			for (int k=0; k<numStr.length() & sum < num; k++) {
				int currDigit = Character.getNumericValue(numStr.charAt(k)); 
				sum += Math.pow(currDigit, k+1) ; 
			}
			if (sum == num) {
				outList.add(num); 
			}
		}
		return outList; 
	}

}
