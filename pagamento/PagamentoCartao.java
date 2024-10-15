package reservavoos.pagamento;

public class PagamentoCartao extends Pagamento implements MetodoDePagamento{
    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;
    private String codigoSeguranca;
    public PagamentoCartao(double valor, String numeroCartao, String nomeTitular, String dataValidade, String codigoSeguranca) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public void processarPagamento() {

    }
}
