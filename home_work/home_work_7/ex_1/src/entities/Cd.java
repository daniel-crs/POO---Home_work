package entities;

import java.util.Scanner;

public class Cd extends Midia {

    protected int nMusicas;

    public Cd() {
    }

    public Cd(int codigo, String name, Double price, int nMusicas, Scanner input) {
        super(codigo, name, price, input);
        this.nMusicas = nMusicas;
    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    @Override
    public final String getTipo() {
        return "CD";
    }

    @Override
    public final String getDetalhes() {
        return "Codigo: " + codigo + " - Name: " + name + " - Preco: R$ " + preco + " - Musica: " + nMusicas;
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

        System.out.print("Digite a musicas: ");
        nMusicas = input.nextInt();

    }

}
