package reservavoos.modelo;

import java.util.ArrayList;

public abstract class Voo {
    private String numero;
    private String data;
    private String hora;
    private String destino;
    private String origem;
    private ArrayList<Voo> listaVoos = new ArrayList<>();


    public Voo(String numero, String data, String hora, String destino, String origem) {
        this.numero = numero;
        this.data = data;
        this.hora = hora;
        this.destino = destino;
        this.origem = origem;
    }
    public String getNumero() {

        return numero;
    }

    public void setNumero(String numero) {

        this.numero = numero;
    }
    public String getData() {

        return data;
    }

    public void setData(String data) {

        this.data = data;
    }

    public String getHora() {

        return hora;
    }

    public void setHora(String hora) {

        this.hora = hora;
    }
    public String getDestino() {

        return destino;
    }

    public void setDestino(String destino) {

        this.destino = destino;
    }

    public String getOrigem() {

        return origem;
    }

    public void setOrigem(String origem) {

        this.origem = origem;
    }
    public String toString () {
        return "Voo (" + numero + ")" + " - Desembarque dia: " + data + " ás " + hora + " | "+ "Destino: " +destino + " | " + "Origem: " + origem;
    }
}

