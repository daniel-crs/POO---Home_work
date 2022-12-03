package entities;

public class Ingresso {

    protected Double valor;

    public Ingresso() {
    }

    public Ingresso(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String imprimeValor() {
        return "R$ " + String.format("%.2f", valor);
    }

}
