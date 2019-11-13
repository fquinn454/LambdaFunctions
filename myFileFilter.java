
import java.io.File;
import java.util.Arrays;


public class myFileFilter{

    private static File[] list(String dir, String ext) {
        File dirFile = new File(dir);
        return dirFile.listFiles(f -> f.getName().endsWith(ext));
    }

    public static void main(String[] args) {
        File[] files = list(".", "iml");
        Arrays.asList(files).forEach(System.out::println);

    }
}
