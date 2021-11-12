import ru.ifmo.se.pokemon.*;

public class Hitmonchan extends Tyrogue {
    public Hitmonchan(String name, int level) {
        super(name, level);
        setStats(50, 105, 79, 35, 110, 76);
        setType(Type.FIGHTING);
        setMove(new MilkDrink(), new DoubleTeam(), new Meditate(), new FirePunch());
    }
}

