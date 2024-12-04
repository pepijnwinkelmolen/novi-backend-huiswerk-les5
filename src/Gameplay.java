import java.util.Objects;

public class Gameplay {
    private int playerX;
    private int playerY;
    private boolean play;

    public Gameplay(int playerX, int playerY, boolean play) {
        this.playerX = playerX;
        this.playerY = playerY;
        this.play = play;
    }


    public int getPlayerX() {
        return playerX;
    }

    public int getPlayerY() {
        return playerY;
    }

    public boolean isPlay() {
        return play;
    }


    public void movePlayer(String input) {
        if (Objects.equals(input, "w")) {
            this.playerY--;
        } else if (Objects.equals(input, "a")) {
            this.playerX--;
        } else if (Objects.equals(input, "s")) {
            this.playerY++;
        } else if (Objects.equals(input, "d")) {
            this.playerX++;
        }
    }

    public void leaveGame(String input) {
        if (Objects.equals(input, "p")) {
            this.play = false;
        }
    }
}
