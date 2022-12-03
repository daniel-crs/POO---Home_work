package entities;

public class Vip extends Ingresso {

    protected Double valorAdicional;

    public Vip() {
    }

    public Vip(Double valor, Double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String imprimeValor() {
        valor += valorAdicional;
        return "Ingresso VIP " + (super.imprimeValor());
    }
}
