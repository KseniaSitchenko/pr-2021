import ru.ifmo.se.pokemon.*;

public class Umbreon extends Pokemon {
    public Umbreon(String name, int level) {
        super(name, level);
        setStats(95, 65, 110, 60, 130, 65);
        setType(Type.DARK);
        setMove(new Confide(), new Swagger(), new Rest(), new Slash());
    }
}