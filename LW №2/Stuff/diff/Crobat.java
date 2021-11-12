import ru.ifmo.se.pokemon.*;

public class Crobat extends Pokemon {
    public Crobat(String name, int level) {
        super(name, level);
        setStats(85, 90, 80, 70, 80, 130);
        setType(Type.FLYING, Type.POISON);
        setMove(new SwordsDance(), new Facade());
    }
}