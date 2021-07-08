import classes.Dog;
import classes.Endereco;
import classes.Pets;
import classes.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(1,"","Dog","???","Masculino",true,true,"Médio","?","Rua Minevera, Perdizes, São Paulo, SP","2021-07-01","Labrador","Amarelo","Médio");

        Endereco end = new Endereco(674405-500,"Rua Mirangaba",4,"Ao lado da Igreja Batista","Amazonas");
        User user1 = new User(1,"Hiarpa",347700254,"hiarpanetto@hotmail.com","9272",99118243,new Date("23/03/2001"),"Masculino",end);
        user1.addPet(dog1);
        user1.verListaPets();




    }
}
