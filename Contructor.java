public class Contructor {
    // Fields
    private String brand;
    private int year;

    // Default Constructor
    public Contructor() {
        // Default values
        this.brand = "Unknown";
        this.year = 0;
    }

    // Parameterized Constructor
    public Contructor(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Contructor defaultCar = new Contructor();
        Contructor parameterizedCar = new Contructor("Toyota", 2022);

        // Displaying information
        System.out.println("Default Car: Brand - " + defaultCar.getBrand() + ", Year - " + defaultCar.getYear());
        System.out.println(
                "Parameterized Car: Brand - " + parameterizedCar.getBrand() + ", Year - " + parameterizedCar.getYear());
    }
}
