import java.util.Scanner;

class Publisher {
    private String name;

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Book {
    protected String title;
    protected Publisher publisher;

    public Book(String title, Publisher publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher.getName());
    }
}

class Literature extends Book {
    private String genre;

    public Literature(String title, Publisher publisher, String genre) {
        super(title, publisher);
        this.genre = genre;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

class Fiction extends Book {
    private String author;

    public Fiction(String title, Publisher publisher, String author) {
        super(title, publisher);
        this.author = author;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of books: ");
        n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");

            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("Publisher: ");
            String publisherName = scanner.nextLine();
            Publisher publisher = new Publisher(publisherName);

            System.out.print("Category (1 - Literature, 2 - Fiction): ");
            int category = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (category == 1) {
                System.out.print("Genre: ");
                String genre = scanner.nextLine();
                books[i] = new Literature(title, publisher, genre);
            } else if (category == 2) {
                System.out.print("Author: ");
                String author = scanner.nextLine();
                books[i] = new Fiction(title, publisher, author);
            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Details for Book " + (i + 1) + ":");
            books[i].displayDetails();
            System.out.println("------------------------");
        }
    }
}

