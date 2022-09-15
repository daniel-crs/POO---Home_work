package ex5;

public class Morango {
    String name;
    int quantity;
    double price;

    public Morango(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void print_data() {
        System.out.print("\nName: " + name + " - price R$" + price + " \n");
    }
}
