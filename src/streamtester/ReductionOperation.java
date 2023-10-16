package streamtester;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ReductionOperation {

	public static void specificReductionOperation() {
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		OptionalInt min = nums.stream().mapToInt(i -> i).min();
		OptionalInt max = nums.stream().mapToInt(i -> i).max();
		OptionalDouble avg = nums.stream().mapToInt(i -> i).average();
		long count = nums.stream().mapToInt(i -> i).count();
		int sum = nums.stream().mapToInt(i -> i).sum();
		
		System.out.println("Min: " + min.getAsInt());
		System.out.println("Max: " + max.getAsInt());
		System.out.println("Avg: " + avg.getAsDouble());
		System.out.println("Count: " + count);
		System.out.println("Sum: " + sum);
	}
	
	public static void reduceOperation() {
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Optional<Integer> sum1 = nums.stream().reduce((a,b) -> a+b);
		
		System.out.println("Sum1 of elements using reduce:: " + sum1);
		
		Integer sum2 = nums.stream().reduce(10, (a, b) -> a + b);
		
		System.out.println("Sum2 of elements using reduce:: " + sum2);
		
		Integer sum3 = nums.parallelStream().reduce(10, (a,b) -> a+b, Integer::sum);
		
		System.out.println("Sum3 of elements using reduce with combiner:: " + sum3);
	}
	
	public static void collectOperation() {
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> list1 = nums.stream().map(num -> num*2).collect(Collectors.toList());
		
		System.out.println("Collected list:: " + list1);
		
	}
	
	public static void main(String[] args) {
		specificReductionOperation();
		reduceOperation();
	}
}
