package classes;

import java.util.Date;

public class Ave extends Pets{
    private String especie;
    private String penugem;
    private int registroIbama;

    public Ave(int idPets, String nome, String tipo, String imagem, String genero, String status, String porte, String localP, String localA, Date dataA, Date dataP ,String especie, String penugem, int registroIbama) {
        super(idPets, nome, tipo, imagem, genero, status, porte, localP, localA, dataA, dataP);
        this.especie = especie;
        this.penugem = penugem;
        this.registroIbama = registroIbama;
    }

    public String getEspecie() {
        return especie;
    }

    public String getPenugem() {
        return penugem;
    }

    public int getRegistroIbama() {
        return registroIbama;
    }
}
