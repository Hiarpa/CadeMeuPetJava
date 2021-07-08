package classes;

import java.util.Date;

public abstract class Pets  {
    private int idPets;
    private String nome;
    private String tipo;
    private String imagem;
    private String genero;
    private String status;
    private String porte;
    private String localP;
    private String localA;
    private String dataA;

    public Pets(int idPets, String nome, String tipo, String imagem, String genero, String status, String porte, String localP, String localA, String dataA) {
        this.idPets = idPets;
        this.nome = nome;
        this.tipo = tipo;
        this.imagem = imagem;
        this.genero = genero;
        this.status = status;
        this.porte = porte;
        this.localP = localP;
        this.localA = localA;
        this.dataA = dataA;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "idPets=" + idPets +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", imagem='" + imagem + '\'' +
                ", genero='" + genero + '\'' +
                ", status='" + status + '\'' +
                ", porte='" + porte + '\'' +
                ", localP='" + localP + '\'' +
                ", localA='" + localA + '\'' +
                ", dataA='" + dataA + '\'' +
                '}';
    }

    public void verifica_tipo(){
        return;
    }

    public void verificar_status(){return;}

    public int getIdPets() {
        return idPets;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getImagem() {
        return imagem;
    }

    public String getGenero() {
        return genero;
    }

    public String getStatus() {
        return status;
    }

    public String getPorte() {
        return porte;
    }

    public String getLocalP() {
        return localP;
    }

    public String getLocalA() {
        return localA;
    }

    public String getDataA() {
        return dataA;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLocalP(String localP) {
        this.localP = localP;
    }

    public void setLocalA(String localA) {
        this.localA = localA;
    }
}
