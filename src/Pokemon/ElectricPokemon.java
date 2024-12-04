package Pokemon;

public class ElectricPokemon extends Pokemon {
    private String[] attacks;

    public ElectricPokemon(String name, int hp, int xp, int level, int attack, int defence, int specAttack, int specDef, int speed) {
        super(name, hp, xp, level,"Electric", attack, defence, specAttack, specDef, speed);
        createPokemon();
    }

    public String getAttacks(int attackNumber) {
        return attacks[attackNumber];
    }

    @Override
    public void getDamaged(int dmg) {
        //we gaan nog niet kijken naar super effective/not very effective.
        this.setHp(this.getHp() - dmg);
    }

    @Override
    public void attack() {

    }

    public void createPokemon() {
        AttackRandomizer attackRandomizer = new AttackRandomizer();
        attacks = attackRandomizer.generateAttacks(super.getType());
    }
}