import ru.ifmo.se.pokemon.*;

class DreamEater extends SpecialMove{
    protected DreamEater(){
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

class DoubleTeam extends StatusMove {
    protected DoubleTeam(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, +1);
    }
    @Override
    protected String describe() {
        return "увернулся";
    }
}


class Tickle extends StatusMove{
    protected Tickle(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
        p.setMod(Stat.DEFENSE, -1);
    }
    @Override
    protected String describe(){
        return "щекочет супостата";
    }
}

class TailWhip extends StatusMove{
    protected TailWhip(){
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

class Facade extends PhysicalMove{
    protected Facade(){
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

class Confide extends StatusMove {
    protected Confide(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    @Override
    protected String describe(){
        return "изничтожил супостатскую уверенность";
    }
}

class Swagger extends StatusMove{
    protected Swagger(){
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, +2);
        Effect.confuse(p);
    }
    @Override
    protected String describe() {
        return "изволит щеголять";
    }
}

class CottonSpore extends StatusMove{
    protected CottonSpore(){
        super(Type.GRASS, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -2);
    }
    @Override
    protected String describe(){
        return "рассыпает хлопковые споры";
    }
}


class Confusion extends SpecialMove{
    protected Confusion(){
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

class Waterfall extends PhysicalMove{
    protected Waterfall(){
        super(Type.WATER, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.2) Effect.flinch(p);
    }
    @Override
    protected String describe(){
        return "вынуждает супостата содрогнуться";
    }
}