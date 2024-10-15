package reservavoos.pagamento;

public class PagamentoPix extends Pagamento implements MetodoDePagamento{
    private String chavePix;

    public PagamentoPix(double valor) {
        super(valor);
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {

    }
}
