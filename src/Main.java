import classes.Dog;
import classes.Endereco;
import classes.Pets;
import classes.User;
import database.Database;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.ParseException;

public class Main {
    static Database db;
    public static void main(String[] args) throws ParseException {

        /*
        Dog dog1 = new Dog(1,"Sebastião","Dog","???","Masculino","Achado","Médio","?","Rua Minevera, Perdizes, São Paulo, SP",new Date("2021/03/23"),new Date(),"Labrador","Amarelo","Médio");
        Dog dog2 = new Dog(2,"Max","Dog","???","Masculino","Achado","Médio","?","Rua Minevera, Perdizes, São Paulo, SP",new Date("2021/07/01"),new Date(),"Labrador","Amarelo","Médio");

        Endereco end = new Endereco(674405-500,"Rua Mirangaba",4,"Ao lado da Igreja Batista","Amazonas");
        User user1 = new User(1,"Hiarpa",347700254,"hiarpanetto@hotmail.com","9272",99118243,new Date("23/03/2001"),"Masculino",end);
        user1.addPet(dog1);
        user1.addPet(dog2);
        user1.verListaPets();
        System.out.println(user1.getListapets().size());
         */

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Problema conexão");
        }
        db = new Database();
        int option;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--------BEM VINDO AO CADÊ MEU PET--------");
            System.out.println("1 - Se cadastrar");
            System.out.println("2 - Cadastrar um endereço");
            System.out.println("3 - Cadastrar um pet");

            System.out.println("4 - Alterar dados de usuario");
            System.out.println("5 - Ver minha lista de pets");

            System.out.println("6 - Ver Pets Perdidos e Achados");

            System.out.println("7 - Ver Usuários");
            System.out.println("8 - Ver Endereço");


            option = scanner.nextInt();
            process(option);

        }while(option != 0);
    }

    private static void process(int option) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        //SimpleDateFormat formatar = new SimpleDateFormat("YYYY-MM-DD");

        switch (option){
            case 1: {
                System.out.println("---- CADASTRANDO UM USÚARIO ----");
                System.out.println("Qual é o id do novo usúario ?");
                int id = scanner.nextInt();
                System.out.println("Qual é o seu nome ?");
                String nome = scanner.next();
                System.out.println("Qual é o seu cpf ?");
                int cpf = scanner.nextInt();
                System.out.println("Qual é o seu email ?");
                String email = scanner.next();
                System.out.println("Define uma senha: ");
                String senha = scanner.next();
                System.out.println("Qual é o número do seu telefone ?");
                int telefone = scanner.nextInt();
                System.out.println("Sua data de nascimento: (Formato = Ano-Mês-Dia)");
                java.sql.Date dataNasc = Date.valueOf(scanner.next());
                System.out.println("Qual é o seu genêro: (Opcional)");
                String genero = scanner.next();

                User newUser = new User(id,nome,cpf,email,senha,telefone,dataNasc,genero);
                db.addNewUser(newUser);
                break;
            }
            case 2: {
                System.out.println("--- CADASTRANDO UM ENDEREÇO---");
                System.out.println("Qual é o id do usúario ?");
                int idUser = scanner.nextInt();
                System.out.println("Digite o seu CEP: ");
                int cep = scanner.nextInt();
                System.out.println("Digite o nome da sua rua: ");
                String rua = scanner.next();
                System.out.println("Digite o número da casa: ");
                int numero = scanner.nextInt();
                System.out.println("Digite o complemento:  ");
                String complemento = scanner.next();
                System.out.println("Digite o seu estado: ");
                String estado = scanner.next();

                User user = db.getUserById(idUser);
                Endereco newEnd = new Endereco(cep,rua,numero,complemento,estado);
                user.setEnd(newEnd);

                break;
            }
            case 3: {
                System.out.println("--- CADASTRANDO UM PET---");
                System.out.println("Digite o id do usuario: ");
                int idUser = scanner.nextInt();
                User user = db.getUserById(idUser);
                int casePet;
                String status = null,localP = null, localA =null;
                java.sql.Date dataA = new java.sql.Date(System.currentTimeMillis());
                java.sql.Date dataP = new java.sql.Date(System.currentTimeMillis());
                do{
                    System.out.println("O pet foi achado ou perdido ?" +
                            "1 - Perdido" +
                            "2 - Achado");
                    casePet = scanner.nextInt();
                }while(casePet != 1 && casePet != 2);
                System.out.println("Qual é o id do pet ?");
                int idPet = scanner.nextInt();
                System.out.println("O pet possui nome ? (Caso não saiba, deixe nulo)");
                String nomePet = scanner.next();
                System.out.println("Qual é o genêro do pet ? (Caso não saiba, deixe nulo)");
                String generoPet = scanner.next();
                System.out.println("Qual é o porte do pet ? (Pequeno, Médio, Grande)");
                String portePet = scanner.next();
                if(casePet == 1){
                    status = "Perdido";
                    System.out.println("Qual foi o ultimo local que o pet esteve ? ");
                    localP = scanner.next();
                    System.out.println("Qual foi a data em que o pet foi perdido ? (Formato = Ano-Mês-Dia)");
                    try {
                        dataP = Date.valueOf(scanner.next());
                    }catch (java.lang.IllegalArgumentException exception){
                        System.out.println("Tente preencher data corretamente");
                    }
                }else if(casePet == 2) {
                    status = "Achado";
                    System.out.println("Qual foi o local que o pet foi achado ?");
                    localA = scanner.next();
                    System.out.println("Qual foi a data em que o pet foi achado ? (Formato = Ano-Mês-Dia)");
                    dataA = Date.valueOf(scanner.next());
                }

                System.out.println("Digite o tipo do seu pet: " +
                        "1 - Cachorro" +
                        "2 - Gato" +
                        "3 - Ave" +
                        "4 - Outros");
                int opcaoPet = scanner.nextInt();
                switch (opcaoPet) {
                    case 1:{
                        String tipoPet = "Cachorro";
                        System.out.println("Digite a raça do cachorro: ");
                        String raca = scanner.next();
                        System.out.println("Digite a cor do cachorro: ");
                        String cor = scanner.next();
                        System.out.println("Digite o tipo de pelo do cachorro: ");
                        String pelo = scanner.next();
                        Dog newDog = new Dog(idPet,nomePet,tipoPet,generoPet,status,portePet,localP,localA,dataA,dataP,raca,cor,pelo);
                        db.addNewDog(newDog);
                        break;
                    }
                    case 2:{
                        String tipoPet = "Gato";
                        System.out.println("Digite a raça do gato: ");
                        String raca = scanner.next();
                        System.out.println("Digite a cor do gato: ");
                        String cor = scanner.next();
                        System.out.println("Digite o tipo de pelo do gato: ");
                        String pelo = scanner.next();
                    }
                    case 3:{
                        String tipoPet = "Ave";
                        System.out.println("Digite a especie da ave: ");
                        String especie = scanner.next();
                        System.out.println("Digite a cor da penugem da ave: ");
                        String penugem = scanner.next();
                        System.out.println("Digite o registro do IBAMA: (Deixe nulo, caso não seja ave exótica");
                        String registroIbama = scanner.next();
                    }
                    case 4: {
                        String tipoPet = "Outros";
                        System.out.println("Digite a especie do seu pet: ");
                        String especie = scanner.next();
                        System.out.println("Digite uma breve descrição do pet: ");
                        String descricao = scanner.next();
                    }
                    break;
                }
                break;
            }
            case 4: {
                System.out.println("--- ALTERANDO DADOS DE UM USUARIO ---");
                System.out.println("Qual é o id do usúario ?");
                int idUser = scanner.nextInt();
                User user = db.getUserById(idUser);
                System.out.println("Digite o novo email: ");
                user.setEmail(scanner.next());
                System.out.println("Digite o novo telefone: ");
                user.setTelefone(scanner.nextInt());
                System.out.println("Digite a nova data de nascimento: ");
                String data = scanner.next();
                java.sql.Date dataNasc = Date.valueOf(data);
                user.setDataNasc(dataNasc);
                System.out.println("Digite o gênero: ");
                user.setGenero(scanner.next());
                break;
            }
            case 5:{
                System.out.println("--- LISTANDO MEUS PETS ---");
                System.out.println("Qual é o id do usúario ?");
                User user = db.getUserById(scanner.nextInt());

                user.verListaPets();
            }
            case 7: {
                System.out.println("-----LISTANDO USUARIOS-----");

                ArrayList<User> persistedUsers = db.getUsers();

                for(User user : persistedUsers) {
                    if (user != null) {
                        System.out.println("ID: " + user.getIdUser());
                        System.out.println("Nome: " + user.getNome());
                        System.out.println("CPF: " + user.getCpf());
                        System.out.println("Email: " + user.getEmail());
                        System.out.println("Senha: " + user.getSenha());
                        System.out.println("Telfone: " + user.getTelefone());
                        System.out.println("Data de nascimento: " + user.getDataNasc());
                        System.out.println("Gênero: " + user.getGenero());
                        System.out.println("---------------------------");
                    }
                }
                break;
            }

        }
    }
}
