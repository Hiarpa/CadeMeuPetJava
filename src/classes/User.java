package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class User {
    private int idUser;
    private String nome;
    private int cpf;
    private String email;
    private String senha;
    private int telefone;
    private Date dataNasc;
    private String genero;
    private List<Pets> listapets;
    private Endereco end;

    public User(int idUser, String nome, int cpf, String email, String senha, int telefone, Date dataNasc, String genero,Endereco end) {
        this.idUser = idUser;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.listapets = new ArrayList<>();
        this.end = end;
    }

    public void addPet(Pets pet){
        listapets.add(pet);
    }

    public void deletePet(int id){
        listapets.remove(id);
    }

    public void verListaPets(){
        for(Pets valor: listapets){
            System.out.println(listapets);
        }
    }

    public void alterPet(Pets pet){
        Scanner scanner = new Scanner(System.in);

        System.out.println("O que você deseja alterar ? ");
        System.out.println("1-Nome");
        System.out.println("2-Gênero");
        System.out.println("3-Porte");
        int opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                System.out.println("O nome atual do pet é " + pet.getNome() + ". Deseja alterar para qual ?");
                String newName = scanner.next();
                pet.setNome(newName);
            case 2:
                System.out.println("O gênero atual do pet é " + pet.getGenero() + ". Deseja alterar para qual ?");
                String newGender = scanner.next();
                pet.setGenero(newGender);
            case 3:
                System.out.println("O porte atual do pet é " + pet.getPorte() + ". Deseja alterar para qual ?");
                String newPorte = scanner.next();
                pet.setPorte(newPorte);
        }
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public int getTelefone() {
        return telefone;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public String getGenero() {
        return genero;
    }

    public List<Pets> getListapets() {
        return listapets;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}


