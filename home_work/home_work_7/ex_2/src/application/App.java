package application;

import java.util.Scanner;

import entities.Carro;
import entities.Moto;
import entities.Veiculos;

public class App {
    public static void main(String[] args) throws Exception {
        final Scanner input = new Scanner(System.in);

        int option, flag = 0;

        Veiculos moto = new Moto(null, null, 0, input);
        Veiculos carro = new Carro(null, null, null, input);

        do {
            choose_option();

            System.out.print("\n\noption: ");
            option = input.nextInt();
            switch (option) {

                case 1:
                    System.out.print("\nDados da moto\n");

                    moto.setModelo("Moto");
                    moto.inserirDados();
                    moto.printDados();
                    break;

                case 2:
                    System.out.print("\nDados do carro\n");
                    carro.setModelo("Carro");
                    carro.inserirDados();
                    carro.printDados();
                    break;

                case 0:
                    flag = 1;
                    break;

                default:
                    System.out.print("\nThis option don't exists !!!\n");

            }
        } while (flag != 1);

        input.close();
    }

    public static void choose_option() {

        System.out.print("\n Veiculo store ");
        System.out.print("\n 1 - Comprar moto");
        System.out.print("\n 2 - Comprar carro");
        System.out.print("\n 0 - exit\n");

    }

}