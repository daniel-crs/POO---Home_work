package entities;

public class Normal extends Ingresso {

    public Normal() {
    }

    public Normal(Double valor) {
        super(valor);
    }

    @Override
    public String imprimeValor() {
        return "Ingresso Normal sera de R$ " + String.format("%.2f", valor);
    }

}
