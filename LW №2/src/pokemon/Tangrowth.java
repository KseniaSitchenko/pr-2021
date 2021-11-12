package pokemon;
import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Tangrowth extends Tangela {
    public Tangrowth(String name, int level) {
        super(name, level);
        setStats(100,100, 125, 110, 50, 50);
        setType(Type.GRASS);
        setMove(new Facade(), new Confide(), new Swagger(), new CottonSpore());
    }
}