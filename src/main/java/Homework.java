import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Homework {
    public static void main(String[] args) {
        List<String> surnames = Arrays.asList("Johnson","Murrey","Eastwood","Jameson");

        surnames.stream()
                .filter(surname->surname.startsWith("J"))
                .forEach(System.out::println);

        String[] words = {"apple", "banana", "pineapple", "cherry", "grape", "car", "wood", "stone"};

        Stream.of(words)
                .sorted()
                .forEach(System.out::println);
    }
}
