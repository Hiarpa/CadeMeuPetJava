package classes;

import java.util.Date;

public class Ave extends Pets{
    private String especie;
    private String penugem;
    private int registroIbama;

    public Ave(int idPets, String nome, String tipo, String imagem, String genero, boolean status_A, boolean status_P, String porte, String localP, String localA, String dataA, String especie, String penugem, int registroIbama) {
        super(idPets, nome, tipo, imagem, genero, status_A, status_P, porte, localP, localA, dataA);
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
