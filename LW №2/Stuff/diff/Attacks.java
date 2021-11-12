import ru.ifmo.se.pokemon.*;


class Bite extends PhysicalMove{
    protected Bite(){
        super(Type.DARK, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3) Effect.flinch(p);
    }
    @Override
    protected String describe(){
        return "изволит делать кусь";
    }
}


class Rest extends StatusMove {
    protected Rest() {
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().condition(Status.SLEEP).turns(2));
        p.getStat(Stat.HP);
    }
    @Override
    protected String describe(){
        return "дремлет";
    }
}


class PerishSong extends StatusMove{
    protected PerishSong(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.HP, (int) p.getStat(Stat.HP));
    }
    @Override
    protected String describe(){
        return "поразил всех своим пением";
    }
}


class ThunderWave extends StatusMove {
    protected ThunderWave() {
        super(Type.ELECTRIC, 0, 90);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().condition(Status.PARALYZE));
        p.addEffect(new Effect().chance(0.75).stat(Stat.ACCURACY, 1));
        p.addEffect(new Effect().stat(Stat.SPEED, (int)p.getStat(Stat.SPEED) / 2));
    }
    @Override
    protected String describe() {
        return "парализовал супостата";
    }
}


class MilkDrink extends StatusMove{
    protected MilkDrink(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        if (p.getHP() <= p.getStat(Stat.HP)*0.5)
            p.setMod(Stat.HP, (int) Math.round(p.getHP()+p.getStat(Stat.HP)*0.5));
        else
            p.setMod(Stat.HP, (int) Math.round(p.getStat(Stat.HP)));
    }
    @Override
    protected String describe(){
        return "испил молочка";
    }
}


class Meditate extends StatusMove {
    protected Meditate(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, +1);
    }
    @Override
    protected String describe() {
        return "ушел в себя";
    }
}


class FirePunch extends PhysicalMove {
    protected FirePunch(){
        super(Type.FIRE, 75, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1)
            Effect.burn(p);
    }
    @Override
    protected String describe() {
        return "устраивает пожар";
    }
}

class Guillotine extends PhysicalMove {
    protected Guillotine(){
        super(Type.NORMAL, 0, 30);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.HP, (int) p.getStat(Stat.HP));
    }
    @Override
    protected String describe() {
        return "изничтожил супостата";
    }
}


class JumpKick extends PhysicalMove {
    protected JumpKick(){
        super(Type.FIGHTING, 100, 95);
    }
    @Override
    protected String describe() {
        if (this.accuracy == 0) return "опростоволосился и ударил себя";
        else return "уничтожил и закопал супостата";
    }
    protected void applyOppDamage(Pokemon def, double damage){
        if (this.accuracy > 0) def.setMod(Stat.HP, (int)Math.round(damage));
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage){
        if (this.accuracy == 0) {
            att.setMod(Stat.HP, (int)Math.round(att.getHP() - att.getStat(Stat.HP)*0.5));
        }
    }
}

class MirrorShot extends SpecialMove {
    protected MirrorShot(){
        super(Type.STEEL, 65, 85);
    }
        @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3)
            p.setMod(Stat.ACCURACY, -1);
    }
    @Override
    protected String describe() {
        return "понижает ясность супостата";
    }
}


class QuickAttack extends PhysicalMove{
    protected QuickAttack(){
        super(Type.NORMAL, 40, 100);
        super.priority = 1;
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected String describe(){
        return "бьет наотмаш";
    }
}


class EggBomb extends PhysicalMove{
    protected EggBomb(){
        super(Type.NORMAL, 100, 75);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected String describe(){
        return "кидается в супостата яйцами";
    }
}

class Thunder extends SpecialMove{
    protected Thunder(){
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3) Effect.paralyze(p);
    }
    @Override
    protected String describe(){
        return "бушует";
    }
}


class PoisonJab extends PhysicalMove {
    protected PoisonJab() {
        super(Type.POISON, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() <= 0.3)
            Effect.poison(p);
    }
    @Override
    protected String describe() {
        return "отравляет супостата";
    }
}

class OminousWind extends SpecialMove{
    protected OminousWind(){
        super(Type.GHOST, 60, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        if (Math.random() <= 0.1){
            p.setMod(Stat.ATTACK, +1);
            p.setMod(Stat.DEFENSE, +1);
            p.setMod(Stat.SPECIAL_ATTACK, +1);
            p.setMod(Stat.SPECIAL_DEFENSE, +1);
            p.setMod(Stat.SPEED, +1);
        }
    }
    @Override
    protected String describe(){
        return "зловеще дышит";
    }
}

class Growl extends StatusMove{
    protected Growl(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }
    @Override
    protected String describe(){
        return "сражает супостата рыком";
    }
}


class SwordsDance extends StatusMove{
    protected SwordsDance(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, +2);
    }
    @Override
    protected String describe(){
        return "пляшет с мечами";
    }
}

class FurySwipes extends PhysicalMove{
    protected FurySwipes(){
        super(Type.NORMAL, 18, 80);
    }
    @Override
    protected String describe(){
        return "Fury Swipes";
    }
}

class Slash extends PhysicalMove{
    protected Slash(){
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected String describe(){
        return "разрубает супостата";
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
        return "рассыет хлопковые споры";
    }
}