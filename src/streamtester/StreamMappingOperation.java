package streamtester;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMappingOperation {

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
		List<String> mobileBrands = List.of("Nokia", "Motrola", "Samsung");
		List<String> laptopBrands = List.of("HP", "Dell", "ASUS"); 
		
		List<List<String>> brands = List.of(mobileBrands, laptopBrands);
		
		List<String> brandList = brands.stream()
									.flatMap(Collection::stream)
									.collect(Collectors.toList());
		
		System.out.println("\n\nPrinting brand list:: " + brandList);
	}
	
	public static void main(String[] args) {
		mapOperation();
		flatMapOperation();
	}
}
