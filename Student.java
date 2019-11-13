import java.util.Arrays;
import java.util.Comparator;


public class Student {
    protected String firstname;
    protected String lastname;
    protected int age;


    public Student(String firstname, String lastname,  int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String getLastname(){
        return this.lastname;
    }

    public String toString(){
        return this.firstname+" "+this.lastname+"  Age: "+this.age;
    }

    public static int startsWithE(Student s, Student t){
        if(s.lastname.startsWith("e")&& !t.lastname.startsWith("e")){
            return -1;
        }
        if(s.lastname.startsWith("e")&& t.lastname.startsWith("e")){
            return 0;
        }
        else
            return 1;
    }


    public static void main(String args[]) {

        Integer[] intArray = {1, 7, 3, 4, 8, 2};
        System.out.println(Arrays.asList(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.asList(intArray));


        Student student1 = new Student("fiona", "quinn", 39);
        Student student2 = new Student("fionn", "brookes", 54);
        Student student3 = new Student("gertrude", "campbell", 25);
        Student student4 = new Student("zeb", "egghead", 78);
        Student student5 = new Student("mary", "roche", 101 );
        Student student6 = new Student("pauline", "moore", 37);
        Student student7 = new Student("sophie", "edgar", 41);

        Student[] studentArray = {student1, student2, student3, student4, student5, student6, student7};
        System.out.println(Arrays.asList(studentArray));
        Arrays.sort(studentArray, Comparator.comparing(Student::getAge));
        System.out.println(Arrays.asList(studentArray));
        Arrays.sort(studentArray, Comparator.comparing(Student::getAge).reversed());
        System.out.println(Arrays.asList(studentArray));
        Arrays.sort(studentArray, Comparator.comparing(Student::getLastname));
        System.out.println(Arrays.asList(studentArray));
        Arrays.sort(studentArray, (Student s1, Student s2) -> (startsWithE(s1, s2)));
        System.out.println(Arrays.asList(studentArray));
    }
}