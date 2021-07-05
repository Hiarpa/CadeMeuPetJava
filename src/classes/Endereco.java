package classes;

public class Endereco {
    private int cep;
    private String rua;
    private int numero;
    private String complemento;
    private String estado;

    public Endereco(int cep, String rua, int numero, String complemento, String estado) {
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
