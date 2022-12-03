package entities;

public class CamaroteInferior extends Vip {

    private int idCadeira;

    public CamaroteInferior() {
    }

    public CamaroteInferior(Double valor, Double valorAdicional, int idCadeira) {
        super(valor, valorAdicional);
        this.idCadeira = idCadeira;
    }

    public int getIdCadeira() {
        return idCadeira;
    }

    public void setIdCadeira(int idCadeira) {
        this.idCadeira = idCadeira;
    }

    @Override
    public String imprimeValor() {
        return (super.imprimeValor()) + " no camarote inferior assento " + idCadeira;
    }

}
