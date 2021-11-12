package attacks;
import ru.ifmo.se.pokemon.*;

public class Confusion extends SpecialMove{
    public Confusion(){
        super(Type.PSYCHIC, 50, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) Effect.confuse(p);
    }
    @Override
    protected String describe() {
        return "напускает на супостата смятение";
    }
}
