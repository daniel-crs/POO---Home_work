package entities;

import java.util.Scanner;

public class Dvd extends Midia {

    protected int nFaixas;

    public Dvd() {
    }

    public Dvd(int codigo, String name, Double price, int nFaixas, Scanner input) {
        super(codigo, name, price, input);
        this.nFaixas = nFaixas;
    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    @Override
    public final String getTipo() {
        return "DVD";
    }

    @Override
    public final String getDetalhes() {
        return "Codigo: " + codigo + " - Name: " + name + " - Preco: R$ " + preco + " - Faixa: " + nFaixas;
    }

    @Override
    public final void printDados() {
        System.out.print("Classe " + getTipo() + " - Variaveis ( " + getDetalhes() + " )");
    }

    @Override
    public final void inserirDados() {

        System.out.print("Digite o codigo: ");
        codigo = input.nextInt();

        System.out.print("Digite o nome: ");
        name = input.next();

        System.out.print("Digite o preco: ");
        preco = input.nextDouble();

        System.out.print("Digite a faixa: ");
        nFaixas = input.nextInt();

    }

}
