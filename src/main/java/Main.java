import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream.iterate(1, x -> x * 2)
                .limit(6)
                .forEach(System.out::print);

        Stream.iterate(2, x -> x < 25, x -> x + 6)
                .forEach(System.out::println);

        Stream.iterate(4, x -> x < 100, x -> x * 4)
                .forEach(System.out::println);

        Stream.concat(
                        Stream.of(1, 2, 3, 4),
                        Stream.of(5, 6, 7, 8))
                .forEach(System.out::println);


        IntStream.range(0, 10)
                .forEach(System.out::println);
        LongStream.range(-10l, -5l)
                .forEach(System.out::println);
// first lesson
//        Stream.of(1,2,3)
//                .forEach(System.out::println);
//
//        String str = Math.random() > 0.5 ? "Im feeling lucky" : null;
//        Stream.ofNullable(str)
//                .forEach(System.out::println);
//
//        Stream.generate(() -> 6)
//                .limit(6)
//                .forEach(System.out::println);

    }
}
