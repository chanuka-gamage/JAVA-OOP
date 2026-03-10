import java.util.Scanner;

// ---------- ABSTRACTION ----------
abstract class Person {

    // ---------- PRIVATE VARIABLES (ENCAPSULATION) ----------
    private String name;
    private int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ---------- GETTER METHODS (ENCAPSULATION) ----------
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method
    abstract void role();
}

// ---------- INHERITANCE ----------
class Student extends Person {

    private String course;

    // Constructor
    Student(String name, int age, String course) {
        super(name, age); // call parent constructor
        this.course = course;
    }

    // Getter for course
    public String getCourse() {
        return course;
    }

    // ---------- METHOD OVERRIDING ----------
    @Override
    void role() {
        System.out.println("Role: Student");
    }
}

class Teacher extends Person {

    private String subject;

    // Constructor
    Teacher(String name, int age, String subject) {
        super(name, age); // call parent constructor
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    void role() {
        System.out.println("Role: Teacher");
    }
}

// ---------- MAIN CLASS ----------
public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose type: 1 = Student, 2 = Teacher");
