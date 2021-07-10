package classes;


public class Outros extends Pets{
    private String especie;
    private String descricao;

    public Outros(int idPets, String nome, String tipo, String imagem, String genero, String status, String porte, String localP, String localA, String dataA, String especie, String descricao) {
        super(idPets, nome, tipo, imagem, genero, status, porte, localP, localA, dataA);
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
