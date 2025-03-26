import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IndefinateIteratorStream {
    public static void main(String[] args) {
        Stream<Integer> infStream = Stream.iterate(2,n-> n+2);
        infStream.forEach(System.out::println);

//        when using groupingBy query
        // Case 1 here TreeMap::new, here compiler use type inference help function to deteermine the type
        TreeMap<Integer, List<String>> collect = Stream.of("Hello", "hi", "by", "bye").collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));

        //case 2 if type inferrence work then we need to pass the type inside TreeMap
        TreeMap<Integer, List<String>> collect2 = Stream.of("Hello", "hi", "by", "bye").collect(Collectors.groupingBy(String::length, () -> new TreeMap<Integer, List<String>>(), Collectors.toList()));


    }
}
