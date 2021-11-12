package pokemon;
import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Tangela extends Pokemon {
    public Tangela(String name, int level) {
        super(name, level);
        setStats(65, 55, 115, 100, 40, 60);
        setType(Type.GRASS);
        setMove(new Facade(), new Confide(), new Swagger());
    }
}