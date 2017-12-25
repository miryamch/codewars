package codewars.challenge1;

public class Maskify {

	    public static String maskify(String str) {
	        str = str.trim().replaceAll("\n", ""); 
	        int lStr = str.length(); 
	        if (lStr <4 ) {
	          return str; 
	        }
	        String outStr = "";         
	        String tail = new String(str.substring(lStr-4, lStr)); 
	        int numHashtags = lStr - tail.length(); 
	        for (int i =0; i<numHashtags; i++){
	          outStr += "#"; 
	        }
	        outStr+= tail; 
	        return outStr; 
	    }

}
