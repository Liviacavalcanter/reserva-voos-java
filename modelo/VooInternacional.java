package reservavoos.modelo;

public class VooInternacional extends Voo{
    public VooInternacional(String numero, String data, String hora, String destino, String origem) {
        super(numero, data, hora, destino, origem);
    }
    private String pais;
    private String passaporte;



    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }
}
