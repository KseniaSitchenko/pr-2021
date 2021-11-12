import ru.ifmo.se.pokemon.*;

public class Chinchou extends Pokemon {
    public Chinchou(String name, int level) {
        super(name, level);
        setStats(75, 38, 38, 56, 56, 67);
        setType(Type.WATER, Type.ELECTRIC);
        setMove(new SwordsDance(), new Facade(), new FurySwipes(), new Growl());
    }
}