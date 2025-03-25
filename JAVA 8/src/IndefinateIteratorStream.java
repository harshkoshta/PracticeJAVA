import java.util.stream.Stream;

public class IndefinateIteratorStream {
    public static void main(String[] args) {
        Stream<Integer> infStream = Stream.iterate(2,n-> n+2);
        infStream.forEach(System.out::println);
    }
}
