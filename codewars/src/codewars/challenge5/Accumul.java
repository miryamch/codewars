package codewars.challenge5; 

public class Accumul {

	public static String accum(String inputStr) {
		String outStr = ""; 
		for (int i = 0; i < inputStr.length(); i++) {
			Character c = inputStr.charAt(i); 
			outStr += Character.toUpperCase(c);
			for (int j = 0; j < i; j++) {
				outStr += Character.toLowerCase(c); 
			}
			outStr += "-"; 					
		}
		outStr = outStr.substring(0, outStr.length()-1); 
		System.out.println(outStr);
		return outStr;
	}

}
