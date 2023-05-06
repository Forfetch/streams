import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Terminal {
    public static void main(String[] args) {
        Stream.of(120, 410, 32, 15, 85)
                .forEach(x -> System.out.format("%s ", x));
        System.out.println();

        IntStream.range(0, 1000000)
                .parallel()
                .filter(x -> x % 100000 == 0)
                .map(x -> x / 100000)
                .forEach(x -> System.out.format("%s ", x));
        System.out.println();

        IntStream.range(0, 1000000)
                .parallel()
                .filter(x -> x % 100000 == 0)
                .map(x -> x / 100000)
                .forEachOrdered(x -> System.out.format("%s ", x));
        System.out.println();

        long count = IntStream.range(0, 10)
                .flatMap(x -> IntStream.range(0, x))
                .count();
        System.out.println(count);

        System.out.println(
                IntStream.range(-3, 7)
                        .count()
        );

        System.out.println(
                Stream.of(0, 2, 9, 13, 5, 11)
                        .map(x->x*2)
                        .filter(x -> x % 2 == 1)
                        .count()
        );

        List<Integer> list = Stream.of(1,2,3)
                .collect(Collectors.toList());
        System.out.println(list);

        String s = Stream.of(1,2,3)
                .map(String::valueOf)
                .collect(Collectors.joining("-","<",">"));
        System.out.println(s);

    }
}
