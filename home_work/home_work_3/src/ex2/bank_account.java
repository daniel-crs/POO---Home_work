package ex2;

public class bank_account {
    // Declarations
    String bank_name, customer_name, cpf;
    double account_value, loan_value, money_investment;

    public void display() {
        System.out.println("Name: " + customer_name + " - CPF: " + cpf + " - bank " + bank_name + " - account value R$ "
                + account_value + " - load R$ " + loan_value + " - investment R$ " + money_investment);
    }

}
