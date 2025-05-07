package Task6;
/*
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
 */
public class Book extends Product {
    private String author;
    private boolean isHardcover;

    public Book(int productID, String name, double price, String author, boolean isHardcover) {
        super(productID, name, price);
        this.author = author;
        this.isHardcover = isHardcover;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isHardcover() {
        return isHardcover;
    }

    @Override
    public void print() {
        System.out.println("Product ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Author: " + getAuthor());
        System.out.println("Is hardcover: " + isHardcover());
        
    }
}
