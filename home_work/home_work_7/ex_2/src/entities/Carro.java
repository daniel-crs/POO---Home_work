package entities;

import java.util.Scanner;

public class Carro extends Veiculos {

    protected Double km;

    public Carro() {
    }

    public Carro(String modelo, Double preco, Double km, Scanner input) {
        super(modelo, preco, input);
        this.km = km;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void printDados() {
        System.out.print(
                "\nModelo: " + getModelo() + " - Preco: R$ " + getPreco() + " - Quilometragem: Km " + getKm() + "\n");
    }

    @Override
    public void inserirDados() {

        System.out.print("Digite o preco: ");
        preco = input.nextDouble();

        System.out.print("Digite a quilometragem: Km ");
        km = input.nextDouble();

    }

}