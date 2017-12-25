package codewars.challenge4;

public class Sum {

	public int GetSum(int a, int b) {
		if(a>b) {
			int c = a; 
			a = b; 
			b = c; 
		}
		int sum = 0; 
		for (int i = a; i <= b; i++) {
			sum+=i; 
		}
		return sum;
	}

}
