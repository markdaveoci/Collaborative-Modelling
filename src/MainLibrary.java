public class MainLibrary {
    public static void main(String[] args) {

        Library lib = new Library();

        Author author = new Author("Charles Darwin");

        Book book = new Book();
        lib.addBooking(book);

        String output = lib.getIdentity();

        System.out.println(output);
    }
}
