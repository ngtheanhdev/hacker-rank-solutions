import java.util.*;

class Student {

    private final int id;
    private final String name;
    private final double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCgpa() {
        return this.cgpa;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(events.size(), (s1, s2) -> (Comparator
                .comparingDouble(Student::getCgpa).reversed())
                .thenComparing(Student::getName)
                .thenComparingInt(Student::getId)
                .compare(s1, s2));

        for (String event : events) {
            String[] token = event.split(" ");
            String command = token[0];

            if (command.equals("ENTER")) {
                String name = token[1];
                double cgpa = Double.parseDouble(token[2]);
                int id = Integer.parseInt(token[3]);
                Student student = new Student(id, name, cgpa);
                priorityQueue.add(student);
            } else {
                priorityQueue.poll();
            }
        }

        List<Student> result = new ArrayList<>(priorityQueue.size());
        while (priorityQueue.size() > 0) {
            result.add(priorityQueue.poll());
        }
        return result;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}