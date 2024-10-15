package reservavoos.pagamento;

public abstract class Pagamento {
    private double valor;
    public Pagamento (double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
