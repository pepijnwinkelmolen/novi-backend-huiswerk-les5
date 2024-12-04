/*  POKEMON SPEL
    EMOJIS:
    -boom: \uD83C\uDF33
    -ondergrond bruin: 🟫 \uD83D\uDFEB
    -ondergrond groen: 🟩 \uD83D\uDFE9
    -speler: \uD83E\uDDB9


*/

import Pokemon.Pokemon;
import Pokemon.*;
import java.util.Scanner;

public class Main {
    static boolean play = true;
    static boolean underAttack = false;
    static int playerX = 12;
    static int playerY = 12;
    static ElectricPokemon yourPokemon = new ElectricPokemon("Pikachu", 50, 0, 5, 15, 20, 14, 19, 24);
    static FightHandler fightHandler = new FightHandler(yourPokemon);

    public static void main(String[] args) {
        String player = "\uD83E\uDDB9";
        Gameplay gameplay = new Gameplay(playerX, playerY, play);
        Map map = new Map(player);

        while (play) {
            if (!underAttack) {
                map.printMap(gameplay.getPlayerX(), gameplay.getPlayerY());
            }
            if (!underAttack && map.checkForFight(gameplay.getPlayerX(), gameplay.getPlayerY())) {
                underAttack = true;
                fightHandler.generateEnemyPokemon();
            }

            if (underAttack) {
                fightHandler.generateBattle();
            }

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (underAttack) {
                if (fightHandler.checkFightOver()) {
                    underAttack = false;
                    continue;
                }
            }

            if (underAttack) {
                fightHandler.useMove(input);
            }

            if (!underAttack) {
                gameplay.movePlayer(input);
            }


            gameplay.leaveGame(input);
            play = gameplay.isPlay();
        }
    }
}

