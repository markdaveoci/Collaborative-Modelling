public class MainLibrary {
    public static void main(String[] args) {

        Library lib = new Library();

        Book book = new Book("On the Origin of Species", "Charles Darwin");
        lib.addBooking(book);

        // Collect identities and print once (only println in the code).
        String output = lib.getIdentity() + "\n" + book.getIdentity() + "\n" + book.getAuthor().getIdentity();

        System.out.println(output);
    }
}
