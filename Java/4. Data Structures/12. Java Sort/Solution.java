import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {

    private final int id;
    private final String firstName;
    private final double cgpa;

    public Student(int id, String firstName, double cgpa) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public double getCgpa() {
        return this.cgpa;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String firstName = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, firstName, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort(Comparator.comparing(Student::getCgpa).reversed().
                thenComparing(Student::getFirstName).thenComparing(Student::getId));

        for (Student st : studentList) {
            System.out.println(st.getFirstName());
        }
    }
}
