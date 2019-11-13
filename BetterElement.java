
public class BetterElement {
    public static <T> T betterElement(T s1, T s2, TwoElementPredicate<T> s){
        if(s.isBetter(s1, s2)){
            return s1;
        }
        else
            return s2;

    }

    public static void main(String[] args) {
        System.out.println(betterElement("hello", "people", (s1, s2)-> s1.length()>s2.length()));
        System.out.println(betterElement("hello", "people", (s1, s2)-> true));
        System.out.println(betterElement("hello", "people", (s1, s2)-> s1.length()< s2.length()));
    }
}

