package streamtester;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStreamApp {

	public static void createStreamFromArray() {
		int[] elements = {3, 5, 98, 34};

		IntStream stream = Arrays.stream(elements);

		System.out.println("Printing Stream from Array::");
		stream.forEach(System.out::println);
	}

	public static void createStreamFromCollection() {
		List<Integer> nums = List.of(1, 3, 5, 6, 87, 4);

		Stream<Integer> stream = nums.stream();

		Stream<Integer> parallelStream = nums.parallelStream();

		System.out.println("\n\nPrinting Stream from Collection::");
		stream.forEach(System.out::println);

		System.out.println("\n Printing Parallel Stream from Collection::");
		parallelStream.forEach(System.out::println);
	}

	public static void streamFromFactoryMehtod() {
		Stream<Integer> stream = Stream.of(7, 4, 99, 2);

		IntStream intStream = IntStream.of(7, 4, 99, 2);

		LongStream longStream = LongStream.of(43, 56, 232, 876, 234);

		System.out.println("\n\nPrinting Stream Factory method::");
		stream.forEach(System.out::println);

		System.out.println("\n\nPrinting Int Stream Factory Method::");
		intStream.forEach(System.out::println);

		System.out.println("\n\nPrinting Long Stream Factory Method::");
		longStream.forEach(System.out::println);

	}

	public static void streamFromFileReading() {

		File file = new File("sample.txt") ;

		String str = "What is Lorem Ipsum?\r\n"
				+ "Lorem Ipsum is simply dummy text of the printing and typesetting industry. \r\n"
				+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. \r\n"
				+ "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. \r\n"
				+ "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		try (FileOutputStream fos = new FileOutputStream(file)) {
			fos.write(str.getBytes());
		} catch (IOException e1) {
			e1.printStackTrace();
		}


		try (Stream<String> line = Files.lines(file.toPath())){
			System.out.println("\n\nPrinting Stream from file line:: \n");
			line.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

		file.delete();
	}

	public static void main(String[] args) {
		createStreamFromArray();
		createStreamFromCollection();
		streamFromFactoryMehtod();
		streamFromFileReading();
	}
}
