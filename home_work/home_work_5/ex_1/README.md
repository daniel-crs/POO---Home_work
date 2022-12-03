## SavingsAccount Program

Escreva um programa para testar a classe SavingsAccount. Instancie dois objetos savingsAccount, saver1 e saver2, com saldos de R$ 2.000,00 e R$ 3.000,00, respectivamente. Configure annualInterestRate como 4% e então calcule o juro mensal de cada um dos 12 meses e imprima os novos saldos para os dois poupadores. Em seguida, configure annualInterestRate para 5%, calcule a taxa do próximo mês e imprima os novos saldos para os dois poupadores. A partir das informações acima elabore regras para que os atributos dos objetos não recebam valores indevidos, por exemplo, negativos.

## Attributes

int name;
double bankBalance, annualInterestRate, savingsBalance;

## Destaque

Cada objeto da classe contém uma variável de instância private savingsBalance para indicar a quantidade que o poupador atualmente tem em depósito.

## Methods

1 -> CalculateMonthlyInterest para calcular os juros mensais(multiplicando o savingsBalance por annualInterestRate dividido por 12 — esses juros devem ser adicionados ao savingsBalance).
2 -> ModifyInterestRate que configure o annualInterestRate com um novo valor.
