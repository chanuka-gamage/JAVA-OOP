import java.util.Scanner;

abstract class Animal {
    abstract void sound();
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    String type = "Dog";

    void sound() {
        System.out.println("Dog barks");
    }

    void greet() {
        System.out.println("Dog says Hello!");
    }

    void greet(String name) {
        System.out.println("Dog says hello " + name);
    }

    final void info() {
        System.out.println("Dog type: " + type);
    }
}

class Student {
    private String name;
    private int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class j13 {
    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Loops example");
        System.out.println("2. Inheritance/Overriding example");
        System.out.println("3. Method Overloading example");
        System.out.println("4. Encapsulation example");
        System.out.println("5. Abstraction example");
        System.out.println("6. super & final keyword example");
        System.out.println("7. Exit");
        System.out.print("Enter option: ");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Enter number to loop: ");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                break;

            case 2:
                Dog d = new Dog();
                d.sound();
                d.sleep();
                break;

            case 3:
                Dog dog = new Dog();
                dog.greet();
                dog.greet("Chanuka");
                break;

            case 4:
                sc.nextLine();
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                System.out.print("Enter student age: ");
                int age = sc.nextInt();
                Student s = new Student(name, age);
                System.out.println("Student Name: " + s.getName());
                System.out.println("Student Age: " + s.getAge());
                break;

            case 5:
                Dog dog2 = new Dog();
                dog2.sound();
                dog2.sleep();
                break;

            case 6:
                Dog dog3 = new Dog();
                dog3.info();
                break;

            case 7:
                System.out.println("Exiting...");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid option!");
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
}import java.util.Scanner;

abstract class Animal {
    abstract void sound();
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    String type = "Dog";

    void sound() {
        System.out.println("Dog barks");
    }

    void greet() {
        System.out.println("Dog says Hello!");
    }

    void greet(String name) {
        System.out.println("Dog says hello " + name);
    }

    final void info() {
        System.out.println("Dog type: " + type);
    }
}

class Student {
    private String name;
    private int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class j13 {
    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Loops example");
        System.out.println("2. Inheritance/Overriding example");
        System.out.println("3. Method Overloading example");
        System.out.println("4. Encapsulation example");
        System.out.println("5. Abstraction example");
        System.out.println("6. super & final keyword example");
        System.out.println("7. Exit");
        System.out.print("Enter option: ");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Enter number to loop: ");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                break;

            case 2:
                Dog d = new Dog();
                d.sound();
                d.sleep();
                break;

            case 3:
                Dog dog = new Dog();
                dog.greet();
                dog.greet("Chanuka");
                break;

            case 4:
                sc.nextLine();
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                System.out.print("Enter student age: ");
                int age = sc.nextInt();
                Student s = new Student(name, age);
                System.out.println("Student Name: " + s.getName());
                System.out.println("Student Age: " + s.getAge());
                break;

            case 5:
                Dog dog2 = new Dog();
                dog2.sound();
                dog2.sleep();
                break;

            case 6:
                Dog dog3 = new Dog();
                dog3.info();
                break;

            case 7:
                System.out.println("Exiting...");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid option!");
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
}