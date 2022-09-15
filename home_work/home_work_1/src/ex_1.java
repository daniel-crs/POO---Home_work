// Synthesis - Payday for my employee
// Objective: I need calculate the salary of my employee. If his work more than 40 hours for week (The month is compost to four weeks), I should pay 50% of his salary as an extra hours.
// Input: Salary_For_Houres, extra_Salary and hours worked.
// Output: The total of the salary.

// Import area
import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) throws Exception {
        // Declarations
        int number = 2;
        int[] hours_worked = new int[number];
        String[] name = new String[number];

        // Instrucoes

        get_info_employee(name, hours_worked, number);

        get_salary(name, hours_worked, number);

    }

    // Method for take the employee informetion (Ex: name nad hours worked)
    public static void get_info_employee(String[] name, int[] worked, int number) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < number; i++) {
            System.out.print("\nName: ");
            name[i] = input.next();

            System.out.print("\nHours worked: ");
            worked[i] = input.nextInt();
        }

        input.close();
    }

    // Method for show me the salaray of my employee
    public static void get_salary(String[] name, int[] hours_worked, int number) {
        int extra_hours;
        double salary_total, salary_for_hour = 12;

        for (int i = 0; i < number; i++) {
            if (hours_worked[i] <= 160) {
                salary_total = salary_for_hour * hours_worked[i];
                System.out.println("\nHello " + name[i] + ". This month, you worked " + hours_worked[i]
                        + " hours. Your salary is $" + salary_total + " Dolares.");
            } else {
                extra_hours = hours_worked[i] - 160;
                salary_total = (salary_for_hour * 160) + (extra_hours * (salary_for_hour * 1.5));
                System.out.println("\nHello " + name[i] + ". This month, you worked " + hours_worked[i] + " hours, and "
                        + extra_hours + " hours were of extra work. Your salary is $" + salary_total + " Dolares.");
            }
        }
    }
}
