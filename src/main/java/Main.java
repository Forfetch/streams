import java.util.Comparator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
// 5 lesson
//        Stream.of(1, 2, 3, 4, 2, 6, 7, 2)
//                .takeWhile(x -> x < 3)
//                .forEach(System.out::println);
//
//        IntStream.range(2,7)
//                .takeWhile(x -> x !=5)
//                .forEach(System.out::println);
//
//        Stream.of(1,2,3,4,5,2)
//                .dropWhile(x->x>=3)
//                .forEach(System.out::println);
//        Stream.of(1,2,3,4,2,5)
//                .dropWhile(x->x<3)
//                .forEach(System.out::println);
//        IntStream.range(2, 7)
//                .dropWhile(x -> x < 5)
//                .forEach(System.out::println);
//        IntStream.of(1, 3, 2, 0, 5, 4)
//                .dropWhile(x -> x % 2 == 1)
//                .forEach(System.out::println);
//        DoubleStream.of(0.1,Math.PI)
//                .boxed()
//                .map(Object::getClass)
//                .forEach(System.out::println);
// 4 lesson
//        Stream.of(120,410,85,32,314,12)
//                .skip(2)
//                .forEach(System.out::println);
//        IntStream.range(0,10)
//                .limit(5)
//                .skip(3)
//                .forEach(System.out::println);
//        IntStream.range(0,10)
//                .skip(5)
//                .limit(3)
//                .skip(1)
//                .forEach(System.out::println);
//        IntStream.range(0, 1000000)
//                .sorted()
//                .limit(3)
//                .forEach(System.out::println);
//        Stream.of(120,410,85,32,314,12)
//                .sorted()
//                .forEach(System.out::println);
//        Stream.of(120,410,85,32,314,12)
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);
//        Stream.of(2,1,8,1,3,2)
//                .distinct()
//                .forEach(System.out::println);
//        IntStream.concat(
//                IntStream.range(2,5),
//                IntStream.range(0,4))
//                .distinct()
//                .forEach(System.out::println);
//  3 lesson
//        Stream.of(120, 410, 85, 32, 314, 12)
//                .filter(x -> x > 100)
//                .forEach(System.out::println);
//
//        IntStream.range(2, 9)
//                .filter(x -> x % 3 == 0)
//                .forEach(System.out::println);
//
//        Stream.of("1", "2", "3", "4")
//                .map(Integer::parseInt)
//                .map(x -> x + 10)
//                .forEach(System.out::println);
//
//        Stream.of(120, 410, 85, 32, 314, 12)
//                .map(x->x+11)
//                .forEach(System.out::println);
//
//        Stream.of("10","11","32")
//                .map(x -> Integer.parseInt(x, 16))
//                .forEach(System.out::println);
//
//        Stream.of(120,410,85,32,314,12)
//                .limit(2)
//                .limit(5)
//                .forEach(System.out::println);
//        Stream.of(19)
//                .limit(0)
//                .forEach(System.out::println);
//
// Secnd lesson
//        Stream.iterate(1, x -> x * 2)
//                .limit(6)
//                .forEach(System.out::print);
//
//        Stream.iterate(2, x -> x < 25, x -> x + 6)
//                .forEach(System.out::println);
//
//        Stream.iterate(4, x -> x < 100, x -> x * 4)
//                .forEach(System.out::println);
//
//        Stream.concat(
//                        Stream.of(1, 2, 3, 4),
//                        Stream.of(5, 6, 7, 8))
//                .forEach(System.out::println);
//
//
//        IntStream.range(0, 10)
//                .forEach(System.out::println);
//        LongStream.range(-10l, -5l)
//                .forEach(System.out::println);
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
