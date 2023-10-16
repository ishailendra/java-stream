package streamtester;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MatchingOperation {

	public static void anyMatchOperation() {
		List<Integer> nums = List.of(3, 45, 75, 66, 33, 13,43, 63);
		
		boolean anyEvenNum = nums.stream().anyMatch(num -> num%2 == 0);
		
		System.out.println("Any even number present in the list::  " + anyEvenNum);
	}
	
	public static void allMatchOperation() {
		List<Integer> nums = List.of(3, 4, 2, 8, 12, 46);
		
		boolean allEvenNum = nums.stream().allMatch(num -> num%2 == 0);
		
		System.out.println("All even number present in the list::  " + allEvenNum);
	}
	
	public static void noneMatchOperation() {
		List<Integer> nums = List.of(53, 7, 9, 65, 37, 19, 63, 71);
		
		boolean noneEvenNum = nums.stream().noneMatch(num -> num%2 == 0);
		
		System.out.println("None of the elements are even number:: " + noneEvenNum);
	}
	
	public static void filterStreamOperation() {
		List<Integer> nums = List.of(8, 12, 62, 34, 25, 15, 61, 34, 45, 35, 14);
		
		List<Integer> filteredList = nums.stream().filter(num -> num > 30).collect(Collectors.toList());
		
		System.out.println("Filtered List where num is greater than 30:: " + filteredList);
	}
	
	public static void findFirstOperation() {
		List<String> data = List.of("Apple", "Banana", "Cake", "Random", "Word");
		
		Optional<String> firstData = data.stream().findFirst();
		
		System.out.println("First Element in the list:: " + firstData.get());
	}
	
	public static void findAnyOperation() {
		List<String> data = List.of("Apple", "Banana", "Cake", "Random", "Word");
		
		Optional<String> anyData = data.stream().findAny();
		
		System.out.println("Find Any in the list:: " + anyData.get());
	}
	public static void main(String[] args) {
//		anyMatchOperation();
//		allMatchOperation();
//		noneMatchOperation();
//		filterStreamOperation();
//		findFirstOperation();
		findAnyOperation();
	}
}
