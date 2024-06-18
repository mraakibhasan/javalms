public class Member {
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        System.out.println(name + " borrowed " + book.getTitle());
    }

    public void returnBook(Book book) {
        System.out.println(name + " returned " + book.getTitle());
    }
}
