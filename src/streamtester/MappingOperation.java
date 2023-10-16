package streamtester;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MappingOperation {

	public static void mapOperation() {
		List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
		
		List<String> numsSq = nums.stream().map(num -> {
			//mapping function
			int square = num * num;
			return "Square of " + num + " is " + square;
		}).collect(Collectors.toList());
		
		
		System.out.println("Printing num square list");
		
		numsSq.forEach(System.out::println);
	}
	
	public static void flatMapOperation() {
		List<String> fruits = List.of("Apple", "Banana", "Peach");
		List<String> veg = List.of("Potato", "Cauliflower", "Cabbafe"); 
		
		List<List<String>> brands = List.of(fruits, veg);
		
		List<String> edibles = brands.stream()
									.flatMap(Collection::stream)
									.collect(Collectors.toList());
		
		System.out.println("\n\nPrinting edibles list:: " + edibles);
	}
	
	public static void main(String[] args) {
		mapOperation();
		flatMapOperation();
	}
}
