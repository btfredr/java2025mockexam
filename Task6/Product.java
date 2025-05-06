package Task6;


/*
    Task 6 (35 points)

    Create a Java program to manage products in a store.

    Task 6.1: Create a Class Named Product (4 points)
    Create a class Product with private fields for productID (int), name (String), and price (double).
    Include getter and setter methods for all fields.

    Task 6.2: Constructors for Product (3 points)
    Implement two constructors:
    ● One with productID and name.
    ● One with productID, name, and price.

    Task 6.3: Print Method for Product (3 points)
    Add a print method to output the product’s name and price.

    Task 6.4: Create Subclasses Book and Electronics (4 points)
    Create two subclasses that extend Product, named Book and Electronics.

    Task 6.5: Additional Fields in Book (1 point)
    Add private fields to Book:
    ● author (String)
    ● isHardcover (boolean)

    Task 6.6: Constructor for Book (3 points)
    Add a constructor for Book that initializes all fields (superclass and subclass).

    Task 6.7: Methods in Book (3 points)
    Add methods getAuthor and isHardcover to return the respective field values.

    Task 6.8: Override Print Method in Book (3 points)
    Override the print method in Book to include all fields.

    Task 6.9: Additional Field in Electronics (2 points)
    Add a private field warrantyYears (int) to Electronics.

    Task 6.10: Polymorphic Print Methods in Electronics (4 points)
    Add two methods in Electronics:
    ● One to print only name and price.
    ● One to print all fields, including warrantyYears.

    Task 6.11: Test Class (5 points)
    Create a Test class with a main method to create one Book and one Electronics instance and
    call their print methods.

    Note: Pay attention to access modifiers and OOP principles (inheritance, encapsulation,
    polymorphism).
 */
public class Product {
    private int productID;
    private String name;
    private double price;

    // Constructors
    public Product (int productID, String name) {
        this.productID = productID;
        this.name = name;
    }

    public Product (int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
    }

    // Getters and setters
    public int getID() {
        return productID;
    }

    public void setID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
