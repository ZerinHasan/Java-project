import java.util.ArrayList;
import java.util.Scanner;
class Student {
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}
class Teacher {
    int id;
    String name;
    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Teacher ID: " + id + ", Name: " + name;
    }
}
class Course {
    int id;
    String name;
    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course ID: " + id + ", Name: " + name;
    }
}
public class CollegeManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Student\n2. Add Teacher\n3. Add Course\n4. Display All\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> addTeacher();
                case 3 -> addCourse();
                case 4 -> displayAll();
                case 5 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        students.add(new Student(id, name));
        System.out.println("Student added successfully!");
    }

    static void addTeacher() {
        System.out.print("Enter Teacher ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Teacher Name: ");
        String name = scanner.nextLine();
        teachers.add(new Teacher(id, name));
        System.out.println("Teacher added successfully!");
    }

    static void addCourse() {
        System.out.print("Enter Course ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Course Name: ");
        String name = scanner.nextLine();
        courses.add(new Course(id, name));
        System.out.println("Course added successfully!");
    }

    static void displayAll() {
        System.out.println("\nStudents:");
        students.forEach(System.out::println);
        System.out.println("\nTeachers:");
        teachers.forEach(System.out::println);
        System.out.println("\nCourses:");
        courses.forEach(System.out::println);
}
}