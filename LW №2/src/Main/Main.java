package Main;
import pokemon.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle field = new Battle();
        field.addAlly(new Phione("Baileys", 1));
        field.addAlly(new Tangela("Gin",1));
        field.addAlly(new Porygon2("Absinthe", 1));
        field.addFoe(new Tangrowth("Martini", 1));
        field.addFoe(new Porygon("Jagermeister", 1));
        field.addFoe(new PorygonZ("Tequila",1));
        field.go();
    }
}
