package application;

import java.util.Scanner;
import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Product product;
        int flag = 0, option, quantity_to_buy = 0;
        product = new Product();

        System.out.print("Write the name of product: ");
        product.name = input.next();

        System.out.print("Write the price: $ ");
        product.price = input.nextDouble();

        System.out.print("Write the quantity: ");
        product.quantity = input.nextInt();

        do {
            choose_option();

            System.out.print("\n\noption: ");
            option = input.nextInt();
            switch (option) {

                case 1:
                    System.out.print(product.toString());
                    break;

                case 2:
                    System.out.print("\n How many product you wanna buy ? : ");
                    quantity_to_buy = input.nextInt();

                    product.buy_prducts(quantity_to_buy);
                    break;

                case 0:
                    flag = 1;
                    break;

                default:
                    System.out.print("\nThis option don't exists !!!\n");

            }
        } while (flag != 1);

        System.out.print("\nFinishing!!!");

        input.close();
    }

    public static void choose_option() {

        System.out.print("\n     Store ");
        System.out.print("\n 1 - Info store");
        System.out.print("\n 2 - Buy product");
        System.out.print("\n 0 - exit\n");

    }

}