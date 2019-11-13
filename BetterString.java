
public class BetterString{

    static String betterString(String s1, String s2, TwoStringPredicate s){
        if(s.isBetter(s1, s2)){
            return s1;
        }
        else
            return s2;

    }

    public static void main(String[] args) {
        System.out.println(betterString("hello", "people", (s1, s2)-> s1.length()>s2.length()));
        System.out.println(betterString("hello", "people", (s1, s2)-> true));
        System.out.println(betterString("hello", "people", (s1, s2)-> s1.length()< s2.length()));

    }
}
