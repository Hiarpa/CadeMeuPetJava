package classes;

import java.util.Date;

public class Cat extends Pets{
    private String raca;
    private String cor;
    private String pelo;

    public Cat(int idPets, String nome, String tipo, String genero, String status, String porte, String localP, String localA, java.sql.Date dataA, String raca, String cor, String pelo, java.sql.Date dataP) {
        super(idPets, nome, tipo, genero, status, porte, localP, localA, dataA, dataP);
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
