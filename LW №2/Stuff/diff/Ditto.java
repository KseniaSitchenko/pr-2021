import ru.ifmo.se.pokemon.*;

public class Ditto extends Pokemon {
    public Ditto(String name, int level) {
        super(name, level);
        setStats(48, 48, 48, 48, 48, 48);
        setType(Type.NORMAL);
        setMove(new SwordsDance(), new Facade(), new FurySwipes());
    }
}