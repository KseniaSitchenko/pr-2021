import ru.ifmo.se.pokemon.*;

public class Boundsweet extends Pokemon {
    public Boundsweet(String name, int level) {
        super(name, level);
        setStats(42, 30, 38, 30, 38, 32);
        setType(Type.GRASS);
        setMove(new Guillotine(), new JumpKick());
    }
}
