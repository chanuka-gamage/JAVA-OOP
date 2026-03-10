import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void printinfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price LKR: " + price);
    }

    double calculateTotal(double quantity) {
        double total = price * quantity;
        return total;
    }
}

class Discountedproduct extends Product {
    double discountpercent;

    Discountedproduct(String name, double price, double discount) {
        super(name, price);
        discountpercent = discount;
    }

    double calculateDiscountedTotal(double quantity) {
        double total = calculateTotal(quantity);
        double discountAmount = total * discountpercent / 100;
        double dam = total - discountAmount;
        return dam;
    }
}

public class j14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        System.out.print("Enter quantity: ");
        double quantity = sc.nextDouble();

        // Create object of Discountedproduct
        Discountedproduct product = new Discountedproduct(name, price, discount);

        System.out.println("\n--- Product Information ---");
        product.printinfo();

        double total = product.calculateTotal(quantity);
        double discountedTotal = product.calculateDiscountedTotal(quantity);

        System.out.println("Total Cost (before discount): " + total + " LKR");
        System.out.println("Total Cost (after discount): " + discountedTotal + " LKR");

        sc.close();
    }
}