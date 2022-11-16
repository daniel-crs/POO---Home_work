package application;

import java.util.Scanner;
import entities.HeartRates;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.next();

        System.out.print("Last name: ");
        String lastName = input.next();

        System.out.print("Year you birth: ");
        int year = input.nextInt();

        System.out.print("Month you birth: ");
        int month = input.nextInt();

        System.out.print("Day you birth: ");
        int day = input.nextInt();

        HeartRates person = new HeartRates(name, lastName, year, month, day);

        System.out.print(person.toString());

        input.close();
    }

}
