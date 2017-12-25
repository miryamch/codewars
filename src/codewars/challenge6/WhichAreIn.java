package codewars.challenge6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhichAreIn {

	public static String[] inArray(String[] a, String[] b) {
		Arrays.sort(a);
		List<String> resultList = new ArrayList<>(); 
		for (int i = 0; i < a.length; i++) {
			String strA = a[i]; 
			for (int j = 0; j < b.length; j++) {
				String strB = b[j]; 
				if(strB.contains(strA)) {
					resultList.add(strA); 
					break; 
				}
			}
		}
		String[] outArray = new String[resultList.size()]; 
		return resultList.toArray(outArray);
	}

}
