package reservavoos.modelo;

public abstract class Assento {
    private String numero;


    public String getNumero() {

        return numero;
    }

    public void setNumero(String numero) {

        this.numero = numero;
    }
    public String toString () {
        return "Numero - " + numero;
    }


}
