package application;

import java.util.Scanner;
import entities.HealthProfile;

public class Profile {
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

        System.out.print("Your height: ");
        double height = input.nextDouble();

        System.out.print("Your Weight: ");
        double Weight = input.nextDouble();

        HealthProfile person = new HealthProfile(name, lastName, year, month, day, height, Weight);

        System.out.print(person.toString());

        input.close();
    }
}