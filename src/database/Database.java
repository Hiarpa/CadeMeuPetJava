package database;

import classes.Dog;
import classes.Endereco;
import classes.Pets;
import classes.User;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Database {
    private User[] users;
    private Endereco[] enderecos;
    private Pets[] pets;

    private Statement executorQuery;
    private Connection conn;

    public Database(){
        this.users = new User[500];
        this.enderecos = new Endereco[500];
        this.pets = new Pets[500];

        try {
            String url = "jdbc:mysql://localhost:3306/cade_meu_pet";
            String usuario = "root";
            String senha = "";
            conn = DriverManager.getConnection(url, usuario, senha);

            executorQuery  = conn.createStatement();
        } catch (SQLException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public void addNewUser(User newUser) {
        try {
            String query = "INSERT INTO user (id_user, nome, cpf, email, senha, telefone, data_nascimento, genero) values (?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, newUser.getIdUser());
            preparedStmt.setString(2, newUser.getNome());
            preparedStmt.setInt(3, newUser.getCpf());
            preparedStmt.setString(4, newUser.getEmail());
            preparedStmt.setString(5, newUser.getSenha());
            preparedStmt.setInt(6, newUser.getTelefone());
            preparedStmt.setDate(7, newUser.getDataNasc());
            preparedStmt.setString(8, newUser.getGenero());
            preparedStmt.execute();

        }catch (SQLException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public void addNewDog(Dog newDog){
        try{
            String query =" INSERT into dog (id_pet, nomePet, tipoPet, generoPet, status, portePet, localPerdido, localAchado, dataAchado, dataPerdido, raca,cor,pelo) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1,newDog.getIdPets());
            preparedStmt.setString(2, newDog.getNome());
            preparedStmt.setString(3, newDog.getTipo());
            preparedStmt.setString(4, newDog.getGenero());
            preparedStmt.setString(5, newDog.getStatus());
            preparedStmt.setString(6, newDog.getPorte());
            preparedStmt.setString(7, newDog.getLocalP());
            preparedStmt.setString(8, newDog.getLocalA());
            preparedStmt.setDate(9,newDog.getDataA());
            preparedStmt.setDate(10,newDog.getDataP());
            preparedStmt.setString(11,newDog.getRaca());
            preparedStmt.setString(12,newDog.getCor());
            preparedStmt.setString(13,newDog.getPelo());
            preparedStmt.execute();


        }catch (SQLException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public User getUserById(int userId){
        ResultSet resultado;
        User user = null;
        try{
            resultado = executorQuery.executeQuery("SELECT * from user WHERE id_user = " + userId);
            while(resultado.next()){
                 user = new User(resultado.getInt("id_user"),
                        resultado.getString("nome"),
                        resultado.getInt("cpf"),
                        resultado.getString("email"),
                        resultado.getString("senha"),
                        resultado.getInt("telefone"),
                        resultado.getDate("data_nascimento"),
                        resultado.getString("genero"));
                return user;
            }
        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return user;
    }

    public ArrayList<User> getUsers(){
        ArrayList listaUsers = new ArrayList<User>();
        //SimpleDateFormat formatar = new SimpleDateFormat("d/M/y");
        ResultSet resultado;
        try{
            resultado = executorQuery.executeQuery("SELECT * from user");

            while(resultado.next()){
                User user = new User(resultado.getInt("id_user"),
                        resultado.getString("nome"),
                        resultado.getInt("cpf"),
                        resultado.getString("email"),
                        resultado.getString("senha"),
                        resultado.getInt("telefone"),
                        resultado.getDate("data_nascimento"),
                        resultado.getString("genero"));
                listaUsers.add(user);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listaUsers;
    }
}
