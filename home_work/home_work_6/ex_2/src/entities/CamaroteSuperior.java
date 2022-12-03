package entities;

public class CamaroteSuperior extends Vip {

    private Double valorAdicionalCs;

    public CamaroteSuperior() {
    }

    public CamaroteSuperior(Double valor, Double valorAdicional, Double valorAdicionalCs) {
        super(valor, valorAdicional);
        this.valorAdicionalCs = valorAdicionalCs;
    }

    public Double getValorAdicionalCs() {
        return valorAdicionalCs;
    }

    public void setValorAdicionalCs(Double valorAdicionalCs) {
        this.valorAdicionalCs = valorAdicionalCs;
    }

    @Override
    public String imprimeValor() {
        valor += valorAdicionalCs;
        return (super.imprimeValor()) + " no camarote Superior";
    }

}
