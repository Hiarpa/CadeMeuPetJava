package classes;

import java.util.Date;

public class Cat extends Pets{
    private String raca;
    private String cor;
    private String pelo;

    public Cat(int idPets, String nome, String tipo, String imagem, String genero, boolean status_A, boolean status_P, String porte, String localP, String localA, String dataA, String raca, String cor, String pelo) {
        super(idPets, nome, tipo, imagem, genero, status_A, status_P, porte, localP, localA, dataA);
        this.raca = raca;
        this.cor = cor;
        this.pelo = pelo;
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