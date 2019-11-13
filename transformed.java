import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class transformed {

    public static List<String> transformedStringList(List<String> words, Function<String, String> transformer) {
        List<String> results = new ArrayList<>();
        for(String word: words) {
            results.add(transformer.apply(word));
        }
        return(results);
    }

    public static <T, R> List<R> transformedGenericList(List<T> items, Function<T, R> transformer) {
        List<R> results = new ArrayList<>();
        for(T item: items) {
            results.add(transformer.apply(item));
        }
        return results ;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "my", "name", "is", "fiona");
        System.out.println(Arrays.asList(words));
        List<String> excitingWords = transformedStringList(words, s -> s + "!");
        System.out.println(Arrays.asList(excitingWords));
        List<String> eyeWords = transformedStringList(words, s -> s.replace("i", "eye"));
        System.out.println(Arrays.asList(eyeWords));
        List<String> upperCaseWords = transformedStringList(words, String::toUpperCase);
        System.out.println(Arrays.asList(upperCaseWords));

        System.out.println();

        List<String> words2 = Arrays.asList("watch", "out", "for", "wiggling", "worms");
        System.out.println(Arrays.asList(words2));
        List<String> excitingGenericWords = transformedGenericList(words2, s -> s + "!");
        System.out.println(Arrays.asList(excitingGenericWords));
        List<String> eyeGenericWords = transformedGenericList(words2, s -> s.replace("i", "eye"));
        System.out.println(Arrays.asList(eyeGenericWords));
        List<String> upperCaseGenericWords = transformedGenericList(words2, String::toUpperCase);
        System.out.println(Arrays.asList(upperCaseGenericWords));
        List<Integer> wordLengths = transformedGenericList(words2, String::length);
        System.out.println(Arrays.asList(wordLengths));
    }
}
