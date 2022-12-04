package entities;

import java.util.Scanner;

public class Veiculos {

    protected String modelo;
    protected Double preco;
    protected Scanner input;

    public Veiculos() {
    }

    public Veiculos(String modelo, Double preco, Scanner input) {
        this.modelo = modelo;
        this.preco = preco;
        this.input = input;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void printDados() {
        System.out.print("\nModelo: " + getModelo() + " - Preco: R$ " + getPreco());
    }

    public void inserirDados() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preco: ");
        preco = input.nextDouble();

        input.close();
    }

}