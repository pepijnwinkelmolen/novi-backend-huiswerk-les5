package Pokemon;

import java.util.Random;

public class PokemonRandomizer {
    private int randomInt;
    Random random = new Random();
    String[] pokemonNames = {"Flareon", "Charizard", "Combusken", " Fletchinder", "Litten", "Litwick", "Arcanine", "Camerupt", "Wartortle", "Poliwag", "Cloyster", "Gyarados", "Lapras", "Ludicolo", "Sharpedo"
            , "Octillery", "Bulbasaur", "Meganium", "Leafeon", "Roselia", "Bellsprout", "Oddish", "Tangela", "Sunflora", "Pikachu", "Voltorb", "Magneton", "Electrike", "Ampharos", "Chinchou", "Luxio", "Rotom"};

    public PokemonRandomizer() {
        this.randomInt = random.nextInt(9);
    }

    // name, hp, xp, level, attack, defence, specAttack, specDef, speed

    public FirePokemon createFirePokemon() {
        FirePokemon firePokemon = new FirePokemon(pokemonNames[randomInt], random.nextInt(10) + 13, 0, 5, random.nextInt(15) + 10, random.nextInt(15) + 10, random.nextInt(15) + 10, random.nextInt(15) + 10, random.nextInt(15) + 10);
        return firePokemon;
    }

    public WaterPokemon createWaterPokemon() {
        randomInt += 7;
        WaterPokemon waterPokemon = new WaterPokemon(pokemonNames[randomInt], random.nextInt(10) + 13, 0, 5, random.nextInt(15) + 10, random.nextInt(15) + 10, random.nextInt(15) + 10, random.nextInt(15) + 10, random.nextInt(15) + 10);
        return waterPokemon;
    }

    public GrassPokemon createGrassPokemon() {
        randomInt += 15;
        GrassPokemon grassPokemon = new GrassPokemon(pokemonNames[randomInt], random.nextInt(10) + 13, 0, 5, random.nextInt(15) + 10, random.nextInt(15) + 10, random.nextInt(15) + 10, random.nextInt(15) + 10, random.nextInt(15) + 10);
        return grassPokemon;
    }

    public ElectricPokemon createElectricPokemon() {
        randomInt += 23;
        ElectricPokemon electricPokemon = new ElectricPokemon(pokemonNames[randomInt], random.nextInt(10) + 13, 0, 5, random.nextInt(15) + 10, random.nextInt(15) + 10, random.nextInt(15) + 10, random.nextInt(15) + 10, random.nextInt(15) + 10);
        return electricPokemon;
    }
}
