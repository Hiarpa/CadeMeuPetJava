import classes.Dog;
import classes.Endereco;
import classes.Pets;
import classes.User;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class Main {
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
        int option;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--------BEM VINDO AO CADÊ MEU PET--------");
            System.out.println("1 - Se cadastrar");
            System.out.println("2 - Cadastrar um endereço");
            System.out.println("3 - Fazer Login");
            System.out.println("4 - Alterar dados de usuario");
            System.out.println("5 - Ver Pets Perdidos");
            System.out.println("6 - Ver Pets Achados");

            option = scanner.nextInt();
            process(option);

        }while(option != 0);
    }

    private static void process(int option) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatar = new SimpleDateFormat("d/M/y");

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
                System.out.println("Sua data de nascimento: (Formato = Dia/Mês/Ano)");
                String data = scanner.next();
                Date dataNasc = formatar.parse(data);
                System.out.println("Qual é o seu genêro: (Opcional)");
                String genero = scanner.next();

                User newUser = new User(id,nome,cpf,email,senha,telefone,dataNasc,genero);
                break;
            }
            case 2: {
                System.out.println("--- CADASTRAR UM ENDEREÇO---");
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


                Endereco newEnd = new Endereco(cep,rua,numero,complemento,estado);
                break;
            }

        }
    }
}
