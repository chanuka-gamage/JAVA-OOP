import java.util.Scanner;

abstract class MembershipPlan {
    private String plantype;
    private double registrationfees;
    private double baseprice;

    MembershipPlan(String plantype, double registrationfees, double baseprice) {
        this.plantype = plantype;
        this.registrationfees = registrationfees;
        this.baseprice = baseprice;
    }

    public double getRegistrationFees() {
        return registrationfees;
    }

    public double getBasePrice() {
        return baseprice;
    }

    abstract double calculatePrice();
}

class GroupSession extends MembershipPlan {
    private String paymentpackage;

    GroupSession(String plantype, double registrationfees, double baseprice, String paymentpackage) {
        super(plantype, registrationfees, baseprice);
        this.paymentpackage = paymentpackage;
    }

    double calculatePrice() {
        if (paymentpackage.equalsIgnoreCase("Annual")) {
            return (getRegistrationFees() + getBasePrice() * 12) * 0.8;
        } else if (paymentpackage.equalsIgnoreCase("Monthly")) {
            return getRegistrationFees() + getBasePrice();
        } else {
            return getBasePrice();
        }
    }
}

class PersonalSession extends MembershipPlan {
    PersonalSession(String plantype, double registrationfees, double baseprice) {
        super(plantype, registrationfees, baseprice);
    }

    double calculatePrice() {
        return getRegistrationFees() + (getBasePrice() * 30);
    }
}

abstract class Customer {
    public String name, address;
    public int phone, age, height, weight;

    public Customer(String name, String address, int phone, int age, int height, int weight) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    abstract public double calculateBMR();
    abstract public double calculateTDEE(double activitypoints);
}

class BMR extends Customer {
    private String gender;

    public BMR(String name, String address, int phone, int age, int height, int weight, String gender) {
        super(name, address, phone, age, height, weight);
        this.gender = gender;
    }

    public double calculateBMR() {
        if (gender.equalsIgnoreCase("Male")) {
            return (10 * weight) + (6.25 * height) - (5 * age) + 5;
        } else if (gender.equalsIgnoreCase("Female")) {
            return (10 * weight) + (6.25 * height) - (5 * age) - 161;
        } else {
            return 0;
        }
    }

    public double calculateTDEE(double activitypoints) {
        return calculateBMR() * activitypoints;
    }
}

public class j15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double REG_FEE = 1000.0;
        double BASE_PRICE = 8000.0;

        System.out.println("Choose Plan Type (GroupSession/PersonalSession): ");
        String plantype = sc.nextLine();

        switch (plantype) {
            case "GroupSession":
                System.out.print("Choose payment package (Annual/Monthly): ");
                String paymentpackage = sc.nextLine();
                GroupSession gs = new GroupSession(plantype, REG_FEE, BASE_PRICE, paymentpackage);
                System.out.println("Group Session Price: " + gs.calculatePrice());
                break;

            case "PersonalSession":
                PersonalSession ps = new PersonalSession(plantype, REG_FEE, BASE_PRICE);
                System.out.println("Personal Session Price: " + ps.calculatePrice());
                break;

            default:
                System.out.println("Invalid Plan Type");
        }
    }
}