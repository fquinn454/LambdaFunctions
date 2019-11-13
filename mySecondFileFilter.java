
import java.io.File;
import java.util.Arrays;


public class mySecondFileFilter {

    private static File[] getChildDirsWithLambda(String dir) {
        File dirFile = new File(dir);
        return dirFile.listFiles(d -> d.isDirectory());
    }

    private static File[] getChildDirsWithMethodReference(String dir) {
        File dirFile = new File(dir);
        return dirFile.listFiles(File::isDirectory);
    }

    public static void main(String[] args) {

        Arrays.asList(getChildDirsWithLambda(".")).forEach(System.out::println);
        System.out.println("---------------------------------------------");
        Arrays.asList(getChildDirsWithMethodReference(".")).forEach(System.out::println);

    }

}
