import java.util.Scanner;

// ================= ABSTRACT CLASS =================
abstract class Membershipplan {
    private String plantype;
    private double registrationfees;
    private double baseprice;

    Membershipplan(String plantype, double registrationfees, double baseprice) {
        this.plantype = plantype;
        this.registrationfees = registrationfees;
        this.baseprice = baseprice;
    }

    String getplantype() {
        return plantype;
    }

    double getregistrationfees() {
        return registrationfees;
    }

    double getbaseprice() {
        return baseprice;
    }

    public abstract double calculateprice();
}

// ================= GROUP SESSION =================
class Groupsession extends Membershipplan {

    private String paymentpackage;

    public Groupsession(String plantype, double registrationfees,
                        double baseprice, String paymentpackage) {

        super(plantype, registrationfees, baseprice);
        this.paymentpackage = paymentpackage;
    }

    public double calculateprice() {

        if (paymentpackage.equalsIgnoreCase("Annual")) {
            return getregistrationfees() + (getbaseprice() * 12) * 0.8;
        } else {
            return getregistrationfees() + getbaseprice();
        }
    }
}

// ================= PERSONAL SESSION =================
class Personalsession extends Membershipplan {

    public Personalsession(String plantype, double registrationfees,
                           double baseprice) {

        super(plantype, registrationfees, baseprice);
    }

    public double calculateprice() {
        return getregistrationfees() + (getbaseprice() * 30);
    }
}

// ================= ABSTRACT CUSTOMER =================
abstract class Customer {

    protected String customername;
    protected String address;
    protected int phonenumber;
    protected int age;
    protected int weight;
    protected int height;

    public Customer(String customername, String address, int phonenumber,
                    int age, int height, int weight) {

        this.customername = customername;
        this.address = address;
        this.phonenumber = phonenumber;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public abstract double calculateBMR();
    public abstract double calculateTDEE(double activitypoints);
}

// ================= BMR CLASS =================
class BMR extends Customer {

    private String gender;

    BMR(String customername, String address, int phonenumber,
        int age, int height, int weight, String gender) {

        super(customername, address, phonenumber, age, height, weight);
        this.gender = gender;
    }

    public double calculateBMR() {

        if (gender.equalsIgnoreCase("Male")) {
            return (10 * weight) + (6.25 * height) - (5 * age) + 5;
        } else {
            return (10 * weight) + (6.25 * height) - (5 * age) + 161;
        }
    }

    public double calculateTDEE(double activitypoints) {
        return calculateBMR() * activitypoints;
    }
}

// ================= MAIN CLASS =================
public class j17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the playtype (groupsession/personalsession): ");
        String type = sc.nextLine();

        Membershipplan plan;

        if (type.equalsIgnoreCase("groupsession")) {

            System.out.println("Choose the payment package (Annual/Monthly): ");
            String pack = sc.nextLine();

            plan = new Groupsession("Groupsession", 1000, 8000, pack);
            System.out.println("Your GroupSession price: " + plan.calculateprice());

        } else {

            plan = new Personalsession("Personalsession", 2000, 500);
            System.out.println("Your PersonalSession price: " + plan.calculateprice());
        }

        // Continue
        System.out.println("Do you want to continue with Gym? (Y/N)");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("N")) {
            System.out.println("Thank you...!");
            return;
        }

        // Personal details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        System.out.print("Enter your phone number: ");
        int phone = sc.nextInt();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height (cm): ");
        int height = sc.nextInt();

        System.out.print("Enter your weight (kg): ");
        int weight = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your gender (Male/Female): ");
        String gender = sc.nextLine();

        System.out.println("\nChoose your activity level:");
        System.out.println("1.2 - Sedentary");
        System.out.println("1.375 - Lightly Active");
        System.out.println("1.55 - Moderately Active");
        System.out.println("1.725 - Very Active");
        System.out.println("1.9 - Extremely Active");

        System.out.print("Enter activity points: ");
        double activity = sc.nextDouble();

        BMR customer = new BMR(name, address, phone, age, height, weight, gender);

        System.out.println("\nYour Basal Metabolic Rate: " + customer.calculateBMR());
        System.out.println("Your Total Daily Energy Expenditure: "
                + customer.calculateTDEE(activity));

        sc.close();
    }
}