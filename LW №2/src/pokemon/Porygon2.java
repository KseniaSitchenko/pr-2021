package pokemon;
import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Porygon2 extends Porygon {
    public Porygon2(String name, int level) {
        super(name, level);
        setStats(85, 80, 60, 105, 95, 60);
        setType(Type.NORMAL);
        setMove(new DoubleTeam(), new Swagger(), new Confusion());
    }
}