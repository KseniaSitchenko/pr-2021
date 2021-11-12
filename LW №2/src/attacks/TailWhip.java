package attacks;
import ru.ifmo.se.pokemon.*;

public class TailWhip extends StatusMove{
    public TailWhip(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, -1);
    }
    @Override
    protected String describe(){
        return "ударяет хвостом аки хлыстом";
    }
}
