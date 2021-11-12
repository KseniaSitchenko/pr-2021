package pokemon;
import attacks.*;
import ru.ifmo.se.pokemon.*;

public class PorygonZ extends Porygon2 {
    public PorygonZ(String name, int level) {
        super(name, level);
        setStats(85, 80, 70, 135, 75, 90);
        setType(Type.NORMAL);
        setMove(new DoubleTeam(), new Swagger(), new Confusion(), new Waterfall());
    }
}