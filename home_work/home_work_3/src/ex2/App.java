// Synthesis - I need just create a bank account object.

package ex2;

public class App {
    public static void main(String[] args) throws Exception {
        // Declarations
        bank_account[] account = new bank_account[3];

        // Instrucoes

        account[0].bank_name = "Nubank";
        account[0].customer_name = "Marcos";
        account[0].cpf = "03996645139";
        account[0].account_value = 1.500;
        account[0].loan_value = 500;
        account[0].money_investment = 6.000;

        account[1].bank_name = "Santander";
        account[1].customer_name = "Rebeca";
        account[1].cpf = "92896145121";
        account[1].account_value = 11.500;
        account[1].loan_value = 15.500;
        account[1].money_investment = 200;

        account[2].bank_name = "BRB";
        account[2].customer_name = "Luca";
        account[2].cpf = "86196645743";
        account[2].account_value = 5.500;
        account[2].loan_value = 1.500;
        account[2].money_investment = 16.000;

        for (int i = 0; i < 3; i++) {
            account[i].display();
        }

    }
}
