package ex4;

public class App {
    public static void main(String[] args) throws Exception {
        // Declarations
        Person pessoa1 = new Person();
        Book livro1 = new Book();
        Borrow emprestimo1 = new Borrow();

        // Instrucoes

        pessoa1.name = "Marcos";
        pessoa1.cpf = "03996645139";
        pessoa1.age = 29;
        pessoa1.library_id_card = 3241;

        livro1.book_name = "Senhor dos aneis";
        livro1.book_type = "Fantasia";
        livro1.author = "Tolken";
        livro1.quantity = 25;
        livro1.id = 2;

        emprestimo1.book_name = "Senhor dos aneis";
        emprestimo1.author = "Tolken";
        emprestimo1.id = 2;
        emprestimo1.customer_id_card = 3241;

    }
}
