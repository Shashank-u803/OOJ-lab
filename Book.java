import java.util.Scanner;
class Book {
    String name, author;
    double price;
    int noPage;
    Book() {}
    Book(String name, String author, double price, int noPage) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.noPage = noPage;
    }
    void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of book: ");
        name = sc.nextLine();
        System.out.println("Enter author name: ");
        author = sc.nextLine();
        System.out.println("Enter price of book: ");
        price = sc.nextDouble();
        System.out.println("Enter number of pages: ");
        noPage = sc.nextInt();
    }
    void getDetails() {
        System.out.println("Name of book: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Number of pages: " + noPage);
    }
    public String toString() {
        return "Book name: " + name + "\n" + "Author: " + author + "\n" + "Price: " + price + "\n" + "Number of pages: " + noPage + "\n";
    }
}
class MyBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            books[i] = new Book();
            System.out.println("Enter details for book " + (i + 1));
            books[i].setDetails();
            books[i].getDetails();
        }
        System.out.println("All book details: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
