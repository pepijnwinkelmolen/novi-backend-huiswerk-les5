package Pokemon;

public abstract class Pokemon {
    private String name;
    private int hp;
    private int xp;
    private int level;
    private final String type;
    private int attack;
    private int defence;
    private int specAttack;
    private int specDef;
    private int speed;
    int maxHp = hp;

    public Pokemon(String name, int hp, int xp, int level, String type, int attack, int defence, int specAttack, int specDef, int speed) {
        this.name = name;
        this.hp = hp;
        this.xp = xp;
        this.level = level;
        this.type = type;
        this.attack = attack;
        this.defence = defence;
        this.specAttack = specAttack;
        this.specDef = specDef;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getSpecAttack() {
        return specAttack;
    }

    public void setSpecAttack(int specAttack) {
        this.specAttack = specAttack;
    }

    public int getSpecDef() {
        return specDef;
    }

    public void setSpecDef(int specDef) {
        this.specDef = specDef;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void getDamaged(int dmg);

    public abstract void attack();

    public abstract void createPokemon();

    public void run() {

    }
}
