package Pokemon;

public class WaterPokemon extends Pokemon {
    private String[] attacks;

    public WaterPokemon(String name, int hp, int xp, int level, int attack, int defence, int specAttack, int specDef, int speed) {
        super(name, hp, xp, level,"Water", attack, defence, specAttack, specDef, speed);
        createPokemon();
    }

    public String getAttacks(int attackNumber) {
        return attacks[attackNumber];
    }

    @Override
    public void getDamaged(int dmg) {

    }

    @Override
    public void attack() {

    }

    public void createPokemon() {
        AttackRandomizer attackRandomizer = new AttackRandomizer();
        attacks = attackRandomizer.generateAttacks(super.getType());
    }
}
