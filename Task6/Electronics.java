package Task6;

/*
    Task 6.9: Additional Field in Electronics (2 points)
    Add a private field warrantyYears (int) to Electronics.

    Task 6.10: Polymorphic Print Methods in Electronics (4 points)
    Add two methods in Electronics:
    ● One to print only name and price.
    ● One to print all fields, including warrantyYears.

 */

public class Electronics extends Product{
    private int warrantyYears;

    // Constructor
    public Electronics (int productID, String name, double price, int warrantyYears) {
        super(productID, name, price);
        this.warrantyYears = warrantyYears;
    }

    // Getter
    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void printNameAndPrice() {
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
    }

    public void printAll() {
        System.out.println("Product ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Warranty Years: " + getWarrantyYears());
    }

    
}
