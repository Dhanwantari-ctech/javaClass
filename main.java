// Class definition
class Car {
    // Instance variables (Attributes)
    String brand;
    int year;

    // Parameterized Constructor to initialize object attributes
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Default Constructor
    public Car() {
        this.brand = "Unknown";
        this.year = 0;
    }

    // Instance Method to display car details
    public void displayDetails() {
        System.out.println("Car Brand: " + brand + ", Year: " + year);
    }

    // Instance Method that returns a calculated value
    public int getCarAge(int currentYear) {
        return currentYear - year;
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Car car1 = new Car("Toyota", 2018);

        // Creating an object using the default constructor
        Car car2 = new Car();

        // Calling methods on objects
        System.out.println("--- Car 1 Details ---");
        car1.displayDetails();
        System.out.println("Car Age: " + car1.getCarAge(2026) + " years");

        System.out.println("\n--- Car 2 Details ---");
        car2.displayDetails();
    }
}