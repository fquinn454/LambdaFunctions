
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumSet;


enum CompareOptions {
    REVERSE,
    CASE_INSENSITIVE,
    SPACE_INSENSITIVE
}

public class MyComparator {

    public static Comparator<String> comparatorGenerator(EnumSet<CompareOptions> options) {
        return (x, y) -> {
            if (options.contains(CompareOptions.CASE_INSENSITIVE)) {
                x = x.toLowerCase();
                y = y.toLowerCase();
            }
            if (options.contains(CompareOptions.SPACE_INSENSITIVE)) {
                x = x.replaceAll("\\s+", "");
                y = y.replaceAll("\\s+", "");
            }
            return options.contains(CompareOptions.REVERSE) ? y.compareTo(x) : x.compareTo(y);
        };
    }

    public static void main(String[] args) {

        String[] values = {"BBB", " ccc", "aaa"};
        System.out.println(Arrays.asList(values));
        Arrays.sort(values, comparatorGenerator(EnumSet.of(
                CompareOptions.REVERSE,
                CompareOptions.CASE_INSENSITIVE,
                CompareOptions.SPACE_INSENSITIVE
        )));
        System.out.println(Arrays.asList(values));
        Arrays.sort(values, comparatorGenerator(EnumSet.of(
                CompareOptions.REVERSE,
                CompareOptions.CASE_INSENSITIVE
        )));
        System.out.println(Arrays.asList(values));
        Arrays.sort(values, comparatorGenerator(EnumSet.of(
                CompareOptions.REVERSE
        )));
        System.out.println(Arrays.asList(values));
    }
}

