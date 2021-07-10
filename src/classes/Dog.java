package classes;

import java.util.Date;

public class Dog extends Pets{
    private String raca;
    private String cor;
    private String pelo;

    public Dog(int idPets, String nome, String tipo, String imagem, String genero, String status, String porte, String localP, String localA, Date dataA, Date dataP, String raca, String cor, String pelo) {
        super(idPets, nome, tipo, imagem, genero, status, porte, localP, localA, dataA, dataP);
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
