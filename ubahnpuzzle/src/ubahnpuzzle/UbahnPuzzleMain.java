package ubahnpuzzle;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class UbahnPuzzleMain {

	
	public static void main(String[] args) {
		String s1 = "Hello ";
		String s2 = "World!"; 
		
		boolean result = mysteryFct(s1, s2); 
		
		System.out.println("Result : " +result);
	}

	private static boolean mysteryFct(String s1, String s2) {
		final Supplier<int[ ]> supplier = ()->{
			return IntStream.generate(() -> 0).limit(Character.MAX_VALUE).toArray(); 
		}; 
		final ObjIntConsumer<int []> accumulator = (t, value) -> t[value]++; 
		final BiConsumer<int[], int[]> combiner = (t,u) ->{}; 
		
		return Arrays.equals(s1.chars().collect(supplier, accumulator, combiner),
				s2.chars().collect(supplier, accumulator, combiner));
	}

}
