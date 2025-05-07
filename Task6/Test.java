package Task6;
/*
    Task 6.11: Test Class (5 points)
    Create a Test class with a main method to create one Book and one Electronics instance and
    call their print methods.

    Note: Pay attention to access modifiers and OOP principles (inheritance, encapsulation,
    polymorphism).
 */
public class Test {
    public static void main(String[] args) {
        Book book = new Book(1, "Harry Potter", 19.99, "JK Rowling", true);
        Electronics tv = new Electronics(2, "Samsung TV", 399.99, 5);

        book.print();
        tv.printAll();
    }
}
