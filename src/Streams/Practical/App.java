package Streams.Practical;

import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		
		String[] items = {"car", "computer", "toothpast", "box", "pencil", "tent", "door", "toy"};
		Stream.of(items)
			.filter((x) -> x.startsWith("t"))
			.sorted()
			.forEach(x -> System.out.println(x + " , " ));
		System.out.println();
	}

}
