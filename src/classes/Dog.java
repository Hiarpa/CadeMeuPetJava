package classes;

import java.util.Date;

public class Dog extends Pets{
    private String raca;
    private String cor;
    private String pelo;

    public Dog(int idPets, String nome, String tipo, String genero, String status, String porte, String localP, String localA, java.sql.Date dataA, java.sql.Date dataP, String raca, String cor, String pelo) {
        super(idPets, nome, tipo, genero, status, porte, localP, localA, dataA, dataP);
        this.raca = raca;
        this.cor = cor;
        this.pelo = pelo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void verifica_tipo() {
        super.verifica_tipo();
    }

    @Override
    public void verificar_status() {
        super.verificar_status();
    }

    @Override
    public int getIdPets() {
        return super.getIdPets();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public String getImagem() {
        return super.getImagem();
    }

    @Override
    public String getGenero() {
        return super.getGenero();
    }

    @Override
    public String getStatus() {
        return super.getStatus();
    }

    @Override
    public String getPorte() {
        return super.getPorte();
    }

    @Override
    public String getLocalP() {
        return super.getLocalP();
    }

    @Override
    public String getLocalA() {
        return super.getLocalA();
    }

    @Override
    public java.sql.Date getDataA() {
        return super.getDataA();
    }

    @Override
    public java.sql.Date getDataP() {
        return super.getDataP();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setImagem(String imagem) {
        super.setImagem(imagem);
    }

    @Override
    public void setGenero(String genero) {
        super.setGenero(genero);
    }

    @Override
    public void setPorte(String porte) {
        super.setPorte(porte);
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(status);
    }

    @Override
    public void setLocalP(String localP) {
        super.setLocalP(localP);
    }

    @Override
    public void setLocalA(String localA) {
        super.setLocalA(localA);
    }

    public String getRaca() {
        return raca;
    }

    public String getCor() {
        return cor;
    }

    public String getPelo() {
        return pelo;
    }


}
