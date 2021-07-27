package classes;


import java.util.Date;

public class Outros extends Pets{
    private String especie;
    private String descricao;

    public Outros(int idPets, String nome, String tipo,  String genero, String status, String porte, String localP, String localA, java.sql.Date dataA, java.sql.Date dataP, String especie, String descricao) {
        super(idPets, nome, tipo, genero, status, porte, localP, localA, dataA, dataP);
        this.especie = especie;
        this.descricao = descricao;
    }

    public String getEspecie() {
        return especie;
    }

    public String getDescricao() {
        return descricao;
    }


}
