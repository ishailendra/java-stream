package streamtester;

import java.util.List;

public class ParallelStreamOperation {

	public static void parallelStreamOperation() {
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("Parallel Stream printing in no order");
		nums.parallelStream().map(num -> num*2).forEach(System.out::println);

		System.out.println("\n\nParallel Stream printing in order");
		nums.parallelStream().map(num -> num*2).forEachOrdered(System.out::println);

	}
	
	public static void main(String[] args) {
		parallelStreamOperation();
	}
}
