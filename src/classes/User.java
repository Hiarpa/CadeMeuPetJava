package classes;

import java.util.Date;
import java.util.List;

public class User {
    private int idUser;
    private String nome;
    private int cpf;
    private String email;
    private String senha;
    private int telefone;
    private String dataNasc;
    private String genero;
    private List<Pets> pet;
    private Endereco end;

    public User(int idUser, String nome, int cpf, String email, String senha, int telefone, String dataNasc, String genero, List<Pets> pet, Endereco end) {
        this.idUser = idUser;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.pet = pet;
        this.end = end;
    }

    public List<Pets> getPet() {
        return pet;
    }

    public void verifica_encontrou(){
        return;
    }

    public void adicionar(User u){
        return;
    }

    public void alterar(User u){
        return;
    }

    public void excluir(User u){
        return;
    }

    public void adicionarPet(User u){
        return;
    }

    public void alterarPet(User u){
        return;
    }

    public void excluirPet(User u){
        return;
    }

    public Endereco getEnd() {
        return end;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNome() {
        return nome;
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

    public String getDataNasc() {
        return dataNasc;
    }

    public String getGenero() {
        return genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}


