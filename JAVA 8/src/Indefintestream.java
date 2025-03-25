import java.util.stream.Stream;

public class Indefintestream {
    public static void main(String[] args) {
// It is generating infinitely until we kill it
        Stream<Integer> infstream = Stream.generate(() -> {
            return (int) (Math.random() * 10);
        });
               infstream .forEach(System.out::println);

    }
}