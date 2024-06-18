import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Add Member");
            System.out.println("4. Remove Member");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String bookAuthor = scanner.nextLine();
                    Book book = new Book(bookId, bookTitle, bookAuthor);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.print("Enter book ID to remove: ");
                    bookId = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Enter member ID: ");
                    String memberId = scanner.nextLine();
                    System.out.print("Enter member name: ");
                    String memberName = scanner.nextLine();
                    Member member = new Member(memberId, memberName);
                    library.addMember(member);
                    break;
                case 4:
                    System.out.print("Enter member ID to remove: ");
                    memberId = scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
