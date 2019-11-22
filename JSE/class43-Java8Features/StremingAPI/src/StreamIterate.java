import java.util.stream.Stream;

public class StreamIterate {
	
	public static void main(String[] args) {
		Stream.iterate(1, element -> element +1).
		filter(element -> element % 5 == 0)
		.limit(10)
		.forEach(System.out::println);
	}

}
