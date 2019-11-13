import java.io.File;
import java.util.Arrays;


public class fileSorter {
    private static File[] sort(String dir){
        File dirFile = new File(dir);
        File[] files = dirFile.listFiles();
        Arrays.sort(files, (f1, f2) -> {
            if (f1.isDirectory() && !f2.isDirectory()) {
                return -1;
            } else if (!f1.isDirectory() && f2.isDirectory()) {
                return 1;
            } else {
                return f1.getName().toLowerCase().compareTo(f2.getName().toLowerCase());
            }
        });
        return files;
    }


    public static void main(String[] args) {

        File[] files = sort(".");
        Arrays.asList(files).forEach(System.out::println);

    }
}