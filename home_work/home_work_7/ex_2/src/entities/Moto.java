package entities;

import java.util.Scanner;

public class Moto extends Veiculos {

    protected int ano;

    public Moto() {
    }

    public Moto(String modelo, Double preco, int ano, Scanner input) {
        super(modelo, preco, input);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void printDados() {
        System.out.print("\nModelo: " + getModelo() + " - Preco: R$ " + getPreco() + " - Ano: " + getAno() + "\n");
    }

    @Override
    public void inserirDados() {

        System.out.print("Digite o preco: ");
        preco = input.nextDouble();

        System.out.print("Digite o ano da moto: ");
        ano = input.nextInt();

    }

}
