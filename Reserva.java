package reservavoos;

import reservavoos.modelo.Assento;
import reservavoos.modelo.Voo;

public class Reserva {
    private Cliente cliente;
    private Voo voo;
    private Assento assento;
    private String dataReserva;
    private String numeroDaReserva;

    public void setCliente(Cliente cliente) {

        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Voo getVoo() {

        return voo;
    }

    public void setVoo(Voo voo) {

        this.voo = voo;
    }

    public Assento getAssento() {

        return assento;
    }

    public void setAssento(Assento assento) {

        this.assento = assento;
    }

    public String getDataReserva() {

        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {

        this.dataReserva = dataReserva;
    }

    public String getNumeroDaReserva() {
        return numeroDaReserva;
    }

    public void setNumeroDaReserva(String numeroPedido) {

        this.numeroDaReserva = numeroDaReserva;
    }
    public Reserva (Cliente cliente, Voo voo, Assento assento) {
        this.cliente = cliente;
        this.voo = voo;
        this.assento = assento;
    }

}
