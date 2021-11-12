import ru.ifmo.se.pokemon.*;

public class Croconaw extends Pokemon {
    public Croconaw(String name, int level) {
        super(name, level);
        setStats(65, 80, 80, 59, 63, 58);
        setType(Type.WATER);
        setMove(new Confide(), new Swagger(), new Rest());
    }
}