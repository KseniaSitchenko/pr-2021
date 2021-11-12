package attacks;
import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove{
    public DreamEater(){
        super(Type.PSYCHIC, 100, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        Status PokeCon = def.getCondition();
        if (PokeCon.equals(Status.SLEEP))
            def.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected String describe(){
        return "поглощает сон супостата";
    }
}