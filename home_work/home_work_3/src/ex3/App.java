package ex3;

public class App {
    public static void main(String[] args) throws Exception {
        // Declarations
        Book b1 = new Book();
        Book b2 = new Book();

        // Instrucoes

        b1.book_name = "Senhor dos aneis.";
        b1.book_type = "Fantasia";
        b1.author = "JRR Tpken";
        b1.quantity = 32;
        b1.borrowed_book = 11;
        b1.available_book = 21;

        b2.book_name = "Segunda guerra mundial hoke.";
        b2.book_type = "historia";
        b2.author = "Marcos pontes";
        b2.quantity = 42;
        b2.borrowed_book = 10;
        b2.available_book = 32;

        System.out.println(b1.book_name + " is a " + b1.book_type + " from " + b1.author + ". Actually we have "
                + b1.available_book + " availeble books and " + b1.borrowed_book + " borrowed books.");
        System.out.println(b2.book_name + " is a " + b2.book_type + " from " + b2.author + ". Actually we have "
                + b2.available_book + " availeble books and " + b2.borrowed_book + " borrowed books.");
    }
}
