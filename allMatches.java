import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class allMatches {

    public static List<String> allMatches(List<String> words, Predicate<String> match) {
        List<String> results = new ArrayList<>();
        for (String word : words) {
            if (match.test(word)) {
                results.add(word);
            }
        }
        return results;
    }

    public static <T> List<T> allGenericMatches(List<T> items, Predicate<T> match) {
        List<T> results = new ArrayList<>();
        for(T item:items) {
            if(match.test(item)) {
                results.add(item);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "my", "name", "is", "fiona");

        List<String> shortWords = allMatches(words, s -> s.length() < 4);
        System.out.println(Arrays.asList(shortWords));
        List<String> longWords = allMatches(words, s -> s.length() > 4);
        System.out.println(Arrays.asList(longWords));
        List<String> evenLengthWords = allMatches(words, s -> (s.length() % 2) == 0);
        System.out.println(Arrays.asList(evenLengthWords));
        List<String> containsE = allMatches(words, s -> s.contains("e"));
        System.out.println(Arrays.asList(containsE));

        System.out.println();
        List<String> words2 = Arrays.asList("what", "is", "your", "name", "?");

        List<String> shortsWords = allGenericMatches(words2, s -> s.length() < 4);
        System.out.println(Arrays.asList(shortsWords));
        List<String> longsWords = allGenericMatches(words2, s -> s.length() > 4);
        System.out.println(Arrays.asList(longsWords));
        List<String> evensLengthWords = allGenericMatches(words2, s -> (s.length() % 2) == 0);
        System.out.println(Arrays.asList(evensLengthWords));
        List<String> containE = allGenericMatches(words2, s -> s.contains("e"));
        System.out.println(Arrays.asList(containE));
    }
}
