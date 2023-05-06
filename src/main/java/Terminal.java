import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Terminal {
    public static void main(String[] args) {

        boolean result;
        double result1;
        long result2;

        System.out.println(
                result = Stream.of(1, 2, 3, 4, 5)
                        .noneMatch(x -> x == 9)
        );
        System.out.println(
                result = Stream.of(1, 2, 3, 4, 5)
                        .noneMatch(x -> x == 3)
        );
        System.out.println(
                result = Stream.of(120, 410, 86, 32, 314, 12)
                        .noneMatch(x -> x % 2 == 1)
        );
        System.out.println(
                 result1 = IntStream.range(2,16)
                         .average()
                         .getAsDouble()
        );
        System.out.println(
                result2 = LongStream.range(2,16)
                        .sum()
        );
        LongSummaryStatistics stats = LongStream.range(2,16)
                .summaryStatistics();
        System.out.format("  count: %d%n", stats.getCount());
        System.out.format("    sum: %d%n", stats.getSum());
        System.out.format("average: %.1f%n", stats.getAverage());
        System.out.format("    min: %d%n", stats.getMin());
        System.out.format("    max: %d%n", stats.getMax());
//        int anySeq, firstSeq, anyParallel, firstParallel;
//        System.out.println(
//                anySeq = IntStream.range(5, 65555)
//                        .findAny()
//                        .getAsInt());
//        System.out.println(
//                firstSeq = IntStream.range(5, 65555)
//                        .findFirst()
//                        .getAsInt()
//        );
//        System.out.println(
//                anyParallel = IntStream.range(5, 65555)
//                        .parallel()
//                        .findAny()
//                        .getAsInt()
//        );
//        System.out.println(
//                firstParallel = IntStream.range(5, 65555)
//                        .parallel()
//                        .findFirst()
//                        .getAsInt()
//        );
//        System.out.println(
//                result = Stream.of(1, 2, 3, 4, 5)
//                        .allMatch(x -> x <= 7)
//        );
//        System.out.println(
//                result = Stream.of(1, 2, 3, 4, 5)
//                        .anyMatch(x -> x < 3)
//        );
//        System.out.println(
//                result = Stream.of(120, 410, 85, 32, 314, 12)
//                        .allMatch(x -> x % 2 == 0)
//        );
//        System.out.println(
//                result = Stream.of(120, 410, 85, 32, 314, 12)
//                        .anyMatch(x -> x % 22 == 0)
//        );

//
//        int sum = Stream.of(1, 2, 3, 4, 5)
//                .reduce(10, Integer::sum);
//        System.out.println(sum);
//        Optional<Integer> result = Stream.<Integer>empty()
//                .reduce((acc, x) -> acc + x);
//        System.out.println(result.isPresent());
//
//        Optional<Integer> sum1 = Stream.of(1, 2, 3, 4, 5)
//                .reduce((acc, x) -> acc + x);
//        System.out.println(sum1.get());
//
//        int sum2 = IntStream.of(2, 4, 6, 8)
//                .reduce(5, Integer::sum);
//        System.out.println(sum2);
//
//        int product = IntStream.range(0, 10)
//                .filter(x -> x++ % 4 == 0)
//                .reduce((acc, x) -> acc * x)
//                .getAsInt();
//        System.out.println("product: " + product);
//
//        int min = Stream.of(20,11,45,78,13)
//                .min(Integer::compare).get();
//        System.out.println(min);
//
//        int max = Stream.of(20,11,45,78,13)
//                .max(Integer::compare).get();
//        System.out.println(max);
//

//        Stream.of(120, 410, 32, 15, 85)
//                .forEach(x -> System.out.format("%s ", x));
//        System.out.println();
//
//        IntStream.range(0, 1000000)
//                .parallel()
//                .filter(x -> x % 100000 == 0)
//                .map(x -> x / 100000)
//                .forEach(x -> System.out.format("%s ", x));
//        System.out.println();
//
//        IntStream.range(0, 1000000)
//                .parallel()
//                .filter(x -> x % 100000 == 0)
//                .map(x -> x / 100000)
//                .forEachOrdered(x -> System.out.format("%s ", x));
//        System.out.println();
//
//        long count = IntStream.range(0, 10)
//                .flatMap(x -> IntStream.range(0, x))
//                .count();
//        System.out.println(count);
//
//        System.out.println(
//                IntStream.range(-3, 7)
//                        .count()
//        );
//
//        System.out.println(
//                Stream.of(0, 2, 9, 13, 5, 11)
//                        .map(x->x*2)
//                        .filter(x -> x % 2 == 1)
//                        .count()
//        );
//
//        List<Integer> list = Stream.of(1,2,3)
//                .collect(Collectors.toList());
//        System.out.println(list);
//
//        String s = Stream.of(1,2,3)
//                .map(String::valueOf)
//                .collect(Collectors.joining("-","<",">"));
//        System.out.println(s);

    }
}
