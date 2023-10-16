package streamtester;

import java.util.List;
import java.util.stream.Stream;

public class OrderingOperation {

	public static void sortedOperation() {
		List<Integer> nums = List.of(90,45,65,23,5,67,23,87);
		
		Stream<Integer> sorted = nums.stream().sorted();
		
		System.out.println("\n\nPrinting sorted stream");
		sorted.forEach(System.out::println);
	}
	
	public static void sortedWithComparator() {
		List<Integer> nums = List.of(90,45,65,23,5,67,23,87);
		Stream<Integer> sorted = nums.stream().sorted((o1, o2) -> o2-o1);
		
		System.out.println("\n\nPrinting comparator sorted in desending order stream:: ");
		
		sorted.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		sortedOperation();
		sortedWithComparator();
	}
}
