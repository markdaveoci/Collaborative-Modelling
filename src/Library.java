public class Library {
    public Book book;

    public Library() {
    }

    public void addBooking(Book b) {
        this.book = b;
    }

    public String getIdentity() {
        return "I am the Library Class. I manage the book '" + book.title + "' by " + book.author.name + ".";
    }
}
