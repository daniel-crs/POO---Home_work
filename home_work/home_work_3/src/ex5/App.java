package ex5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Declarations
        Scanner input = new Scanner(System.in);
        String[] product_name = new String[10];
        int increase = 0, flag = 0, option = 0;
        double total_to_pay = 0;

        // Instrucoes
        Morango strawberry = new Morango("strawberry", 120, 1.50);
        Laranja grape = new Laranja("grape", 60, 5.50);
        Morango orange = new Morango("orange", 100, 3.00);

        do {
            System.out.print("\n ***** Market ***** \n");
            System.out.print("\n 1 - strawberry");
            System.out.print("\n 2 - grape");
            System.out.print("\n 3 - orange");
            System.out.print("\n 0 - exit");
            System.out.print("\n ****************** \n\n");
            System.out.print("Choice a option : ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    strawberry.print_data();
                    product_name[increase] = strawberry.name;
                    total_to_pay = total_to_pay + strawberry.price;
                    break;

                case 2:
                    grape.print_data();
                    product_name[increase] = grape.name;
                    total_to_pay = total_to_pay + grape.price;
                    break;

                case 3:
                    orange.print_data();
                    product_name[increase] = orange.name;
                    total_to_pay = total_to_pay + orange.price;
                    break;

                case 0:
                    flag = 1;
                    break;
            }

            increase++;
        } while (flag != 1);

        increase--;

        System.out.print("\nYou buy: ");
        for (int i = 0; i < increase; i++) {
            System.out.print(product_name[i] + " - ");
        }
        System.out.println("All of this cost R$" + total_to_pay);

        input.close();
    }
}
