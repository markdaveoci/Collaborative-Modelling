public class MainLibrary {
    public static void main(String[] args) {

        Library lib = new Library();

        Author author = new Author("Charles Darwin");

        Book book = new Book("The Origin of Species", "Charles Darwin");
        lib.addBooking(book);


        String output = lib.getIdentity() + "\n" + book.getIdentity() +  "\n"  + book.getAuthor().getIdentity();

        System.out.println(output);
    }
}
