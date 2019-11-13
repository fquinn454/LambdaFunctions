import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static junit.framework.TestCase.assertEquals;

interface Collection2<T> extends Collection<T> {
    default void forEachIf(Consumer<T> action, Predicate<T> filter) {
        forEach(e -> {
            if (filter.test(e)) {
                action.accept(e);
            }
        });
    }

    class ArrayList2<T> extends ArrayList<T> implements Collection2<T> {
    }

    public static void main(String[] args) {
        Collection2<Integer> c = new ArrayList2<>();
        c.add(100);
        c.add(-5);
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        c.forEachIf(set::add, e -> e > 0);
        System.out.print(set.size());
        System.out.print(Arrays.toString(set.toArray()));
    }


}