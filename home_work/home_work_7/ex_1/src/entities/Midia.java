package entities;

import java.util.Scanner;

public class Midia {

    protected int codigo;
    protected String name;
    protected Double preco;
    protected Scanner input;

    public Midia() {
    }

    public Midia(int codigo, String name, Double preco, Scanner input) {
        this.codigo = codigo;
        this.name = name;
        this.preco = preco;
        this.input = input;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Codigo: " + codigo + " - Name: " + name + " - Preco: R$ " + preco;
    }

    public void printDados() {
        System.out.print("Classe " + getTipo() + " - Variaveis ( " + getDetalhes() + " )");
    }

    public void inserirDados() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o codigo: ");
        codigo = input.nextInt();

        System.out.print("Digite o nome: ");
        name = input.next();

        System.out.print("Digite o preco: ");
        preco = input.nextDouble();

        input.close();
    }

}
