package application;

import java.util.Scanner;

import entities.Cd;
import entities.Dvd;
import entities.Midia;

public class App {
    public static void main(String[] args) throws Exception {
        final Scanner input = new Scanner(System.in);

        Midia dvd = new Dvd(0, null, null, 0, input);

        Midia cd = new Cd(0, null, null, 0, input);

        dvd.inserirDados();
        System.out.print("\n");
        dvd.printDados();

        System.out.print("\n\n");

        cd.inserirDados();
        System.out.print("\n");
        cd.printDados();

        input.close();
    }
}
