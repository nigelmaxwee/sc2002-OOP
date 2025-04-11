import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Library<Book> library = new Library<>();
        Scanner sc = new Scanner(System.in);

        library.addItem(new Book("1984", "George Orwell", "Fiction", 1949));
        library.addItem(new Book("A Brief History of Time", "Stephen Hawking", "Science", 1988));
        library.addItem(new Book("A Beautiful Mind", "Sylvia Nasar", "Biography", 1998));

        Borrower alice = new Borrower("Alice");

        while (true) {
            System.out.println("\n1. Display All Books\n2. Filter by Genre\n3. Filter by Author\n4. Search by Keyword\n5. Sort by Title\n6. Recommend\n7. Borrow Book\n8. Return Book\n9. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> library.displayItems();
                case 2 -> {
                    System.out.print("Genre: ");
                    library.filterByGenre(sc.nextLine()).forEach(System.out::println);
                }
                case 3 -> {
                    System.out.print("Author: ");
                    library.filterByAuthor(sc.nextLine()).forEach(System.out::println);
                }
                case 4 -> {
                    System.out.print("Keyword: ");
                    library.searchByKeyword(sc.nextLine()).forEach(System.out::println);
                }
                case 5 -> {
                    library.sortByTitle();
                    System.out.println("Sorted books by title:");
                    library.displayItems();
                }
                case 6 -> {
                    System.out.print("Category: ");
                    switch (sc.nextLine()) {
                        case "Science" -> System.out.println("Try 'A Brief History of Time' by Stephen Hawking.");
                        case "Fiction" -> System.out.println("Try '1984' by George Orwell.");
                        case "Biography" -> System.out.println("Try 'A Beautiful Mind' by Sylvia Nasar.");
                        default -> System.out.println("No recommendation.");
                    }
                }
                case 7 -> {
                    System.out.print("Title to borrow: ");
                    String title = sc.nextLine();
                    library.getItems().stream().filter(b -> b.getTitle().equalsIgnoreCase(title)).findFirst().ifPresent(alice::borrowBook);
                    System.out.println(alice);
                }
                case 8 -> {
                    System.out.print("Title to return: ");
                    String title = sc.nextLine();
                    alice.getBorrowedBooks().stream().filter(b -> b.getTitle().equalsIgnoreCase(title)).findFirst().ifPresent(alice::returnBook);
                    System.out.println(alice);
                }
                case 9 -> {
                    System.out.println("Exiting...");
                    return;
                }
            }
        }
    }
}
