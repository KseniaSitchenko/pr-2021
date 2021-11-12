import ru.ifmo.se.pokemon.*;

public class Tsareena extends Steenee {
    public Tsareena(String name, int level) {
        super(name, level);
        setStats(72, 120, 98, 50, 98, 72);
        setType(Type.GRASS);
        setMove(new Guillotine(), new JumpKick(), new MirrorShot(), new MilkDrink());
    }
}

