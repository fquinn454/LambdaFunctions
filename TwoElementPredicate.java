@FunctionalInterface
public interface TwoElementPredicate<T> {
    boolean isBetter(T element1, T element2);
}
