package attacks;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove{
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        Status PokeCon = def.getCondition();
        if (PokeCon.equals(Status.BURN) || PokeCon.equals(Status.POISON) || PokeCon.equals(Status.PARALYZE)) {
            def.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
    }
    @Override
    protected String describe(){
        return "изволит показушничать";
    }
}
