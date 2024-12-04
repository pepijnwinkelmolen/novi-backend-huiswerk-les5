package Pokemon;

import java.util.*;

public class AttackRandomizer {
    private Map<Integer, String> pokemonAttacks = new HashMap<>();

    public AttackRandomizer() {
        pokemonAttacks.put(101, "Hydro Pump");
        pokemonAttacks.put(102, "Surf");
        pokemonAttacks.put(103, "Water Gun");
        pokemonAttacks.put(104, "Bubble");
        pokemonAttacks.put(105, "Rain Dance");
        pokemonAttacks.put(106, "Bubble Beam");
        pokemonAttacks.put(201, "Absorb");
        pokemonAttacks.put(202, "Leaf Blade");
        pokemonAttacks.put(203, "Mega Drain");
        pokemonAttacks.put(204, "Leech Seed");
        pokemonAttacks.put(205, "Magical Leaf");
        pokemonAttacks.put(206, "Solar Beam");
        pokemonAttacks.put(301, "Ember");
        pokemonAttacks.put(302, "Flame Wheel");
        pokemonAttacks.put(303, "Flamethrower");
        pokemonAttacks.put(304, "Blast Burn");
        pokemonAttacks.put(305, "Fire Blast");
        pokemonAttacks.put(306, "Will-O-Wisp");
        pokemonAttacks.put(401, "Spark");
        pokemonAttacks.put(402, "Thunderbolt");
        pokemonAttacks.put(403, "Volt Tackle");
        pokemonAttacks.put(404, "Thunder Shock");
        pokemonAttacks.put(405, "Charge");
        pokemonAttacks.put(406, "Thunder");
    }

    public Map<Integer, String> getPokemonAttacks() {
        return pokemonAttacks;
    }

    public void setPokemonAttacks(Map<Integer, String> pokemonAttacks) {
        this.pokemonAttacks = pokemonAttacks;
    }

    public String[] generateAttacks(String type) {
        Random random = new Random();
        int randomInt;
        ArrayList<String> attacksList = new ArrayList<>();

        while (attacksList.size() < 4) {
            if (Objects.equals(type, "Fire")) {
                randomInt = random.nextInt(6) + 301;
                if (Objects.equals(attacksList.contains(pokemonAttacks.get(randomInt)), false)) {
                   attacksList.add(pokemonAttacks.get(randomInt));
                }
            } else if (Objects.equals(type, "Water")) {
                randomInt = random.nextInt(6) + 101;
                if (Objects.equals(attacksList.contains(pokemonAttacks.get(randomInt)), false)) {
                    attacksList.add(pokemonAttacks.get(randomInt));
                }
            } else if (Objects.equals(type, "Grass")) {
                randomInt = random.nextInt(6) + 201;
                if (Objects.equals(attacksList.contains(pokemonAttacks.get(randomInt)), false)) {
                    attacksList.add(pokemonAttacks.get(randomInt));
                }
            } else if (Objects.equals(type, "Electric")) {
                randomInt = random.nextInt(6) + 401;
                if (Objects.equals(attacksList.contains(pokemonAttacks.get(randomInt)), false)) {
                    attacksList.add(pokemonAttacks.get(randomInt));
                }
            }
        }
        String[] attacks = new String[attacksList.size()];
        for (int i = 0; i < attacksList.size(); i++) {
            attacks[i] = attacksList.get(i);
        }
        return attacks;
    }
}
