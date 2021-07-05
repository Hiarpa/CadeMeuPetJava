package classes;

import java.util.Date;

public abstract class Pets  {
    private int idPets;
    private String nome;
    private String tipo;
    private String imagem;
    private String genero;
    private boolean status_A;
    private boolean status_P;
    private String porte;
    private String localP;
    private String localA;
    private String dataA;

    public Pets(int idPets, String nome, String tipo, String imagem, String genero, boolean status_A, boolean status_P, String porte, String localP, String localA, String dataA) {
        this.idPets = idPets;
        this.nome = nome;
        this.tipo = tipo;
        this.imagem = imagem;
        this.genero = genero;
        this.status_A = status_A;
        this.status_P = status_P;
        this.porte = porte;
        this.localP = localP;
        this.localA = localA;
        this.dataA = dataA;
    }

    public void verifica_tipo(){
        return;
    }

    public void verificar_statusA(){
        return;
    }

    public void verificar_statusP(){
        return;
    }

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

    public boolean isStatus_A() {
        return status_A;
    }

    public boolean isStatus_P() {
        return status_P;
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

    public void setStatus_A(boolean status_A) {
        this.status_A = status_A;
    }

    public void setStatus_P(boolean status_P) {
        this.status_P = status_P;
    }

    public void setLocalP(String localP) {
        this.localP = localP;
    }

    public void setLocalA(String localA) {
        this.localA = localA;
    }
}
