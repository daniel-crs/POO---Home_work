// Synthesis - Retire for my employee
// Objective: I need identify which employees can retire. Age and years worked is a requirement for that.
// Input: Birth, age, year_started and present_year,
// Output: If can retire or not.

// Import area
import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) throws Exception {
        // Declarations
        int number = 5;
        int[] birth = new int[number], year_started = new int[number];
        String[] name = new String[number];

        // Instrucoes

        get_info_employee(name, birth, year_started, number);

        retire_employee(name, birth, year_started, number);

    }

    // Method for take infos of my employee
    public static void get_info_employee(String[] name, int[] birth, int[] year_started, int number) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < number; i++) {
            System.out.print("\nEmployee number " + (i + 1) + " - Name: ");
            name[i] = input.next();

            System.out.print("Employee number " + (i + 1) + " - Year of birth: ");
            birth[i] = input.nextInt();

            System.out.print("Employee number " + (i + 1) + " - Year started at the company: ");
            year_started[i] = input.nextInt();

        }

        input.close();
    }

    // Method to identify if my employee can retire
    public static void retire_employee(String[] name, int[] birth, int[] year_started, int number) {
        int i, present_year = 2022;
        int[] age = new int[number], worked = new int[number];

        for (i = 0; i < number; i++) {
            age[i] = present_year - birth[i];
            worked[i] = present_year - year_started[i];
        }

        for (i = 0; i < number; i++) {
            if (age[i] >= 60 && worked[i] >= 25) {
                System.out.println("\n" + name[i] + ", You have " + age[i] + " years old and " + worked[i]
                        + " years working. Now you can retire.");
            } else if (worked[i] >= 30) {
                System.out.println("\n" + name[i] + ", you have " + worked[i] + " years working. Now you can retire.");
            } else if (age[i] >= 65) {
                System.out.println("\n" + name[i] + ", you have " + age[i] + " years old. Now you can retire.");
            } else {
                System.out.println("\nSorry " + name[i] + ", you need work a little longer before retire.");
            }
        }

    }

}
