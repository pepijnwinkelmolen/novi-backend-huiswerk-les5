import Pokemon.ElectricPokemon;
import Pokemon.Pokemon;
import Pokemon.PokemonRandomizer;

import java.util.Objects;
import java.util.Random;

public class FightHandler {
    Random random = new Random();
    private ElectricPokemon yourPokemon;
    private Pokemon enemyPokemon;


    public FightHandler(ElectricPokemon yourPokemon) {
        this.yourPokemon = yourPokemon;
    }

    public void generateBattle() {
        System.out.println();
        System.out.println("*********************************");
        System.out.println("*                  " + enemyPokemon.getHp() + " " + enemyPokemon.getName() + " *");
        System.out.println("*                                *");
        System.out.println("*                                *");
        System.out.println("* " + yourPokemon.getName() + " " + yourPokemon.getHp() + "                    *");
        System.out.println("*********************************");
        System.out.println();
        System.out.println("1 = " + yourPokemon.getAttacks(0) + " 2 = " + yourPokemon.getAttacks(1) + " 3 = " + yourPokemon.getAttacks(2) + " 4 = " + yourPokemon.getAttacks(3));
    }

    public void useMove(String input) {
        if (Objects.equals(input, "1") || Objects.equals(input, "2") || Objects.equals(input, "3") || Objects.equals(input, "4")) {
            if (input.equals("1")) {
                System.out.println(yourPokemon.getName() + " used " + yourPokemon.getAttacks(0) + "!");
            } else if (input.equals("2")) {
                System.out.println(yourPokemon.getName() + " used " + yourPokemon.getAttacks(1) + "!");
            } else if (input.equals("3")) {
                System.out.println(yourPokemon.getName() + " used " + yourPokemon.getAttacks(2) + "!");
            } else if (input.equals("4")) {
                System.out.println(yourPokemon.getName() + " used " + yourPokemon.getAttacks(3) + "!");
            }
            if (enemyPokemon.getHp() > yourPokemon.getAttack()) {
                 enemyPokemon.getDamaged(yourPokemon.getAttack());
            } else if (enemyPokemon.getHp() > 0 && enemyPokemon.getHp() <= yourPokemon.getAttack()) {
                enemyPokemon.setHp(0);
            }
        }
    }

    public boolean checkFightOver() {
        return enemyPokemon.getHp() <= 0;
    }

    public void generateEnemyPokemon() {
        PokemonRandomizer pokemonRandomizer = new PokemonRandomizer();
        int randomInt = random.nextInt(4);
        if (randomInt == 1) {
            enemyPokemon = pokemonRandomizer.createFirePokemon();
        } else if (randomInt == 2) {
            enemyPokemon = pokemonRandomizer.createWaterPokemon();
        } else if (randomInt == 3) {
            enemyPokemon = pokemonRandomizer.createGrassPokemon();
        } else if (randomInt == 0) {
            enemyPokemon = pokemonRandomizer.createElectricPokemon();
        }
    }
}
