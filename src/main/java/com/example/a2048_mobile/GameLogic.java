import java.util.Random;

public class GameLogic {
    private int[][] gameGrid;
    private int score;
    private int highScore;

    public GameLogic() {
        gameGrid = new int[4][4];
        score = 0;
        highScore = 0;
        addNewTile();
    }

    private void addNewTile() {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(4);
            y = random.nextInt(4);
        } while (gameGrid[x][y] != 0);
        gameGrid[x][y] = (random.nextInt(10) == 0) ? 4 : 2;
    }

    public void move(int direction) {
        // TODO for Duckie: Implement move logic based on direction
    }

    public void merge() {
        // TODO for Duckie: Implement merge logic
    }

    public boolean checkWin() {
        // TODO for Duckie: Implement win condition check
    }

    public boolean checkLose() {
        // TODO for Duckie: Implement lose condition check
    }

    public void increaseScore(int value) {
        score += value;
        if (score > highScore) {
            highScore = score;
        }
    }

    public void saveGameState() {
        // TODO for Duckie: Implement save game state logic
    }

    public void loadGameState() {
        // TODO for Duckie: Implement load game state logic
    }

    // TODO for Duckie: Implement methods for game mechanics (move, merge, check win/lose conditions)
    // TODO for Duckie: Implement methods for scoring system (increase score, update high score)
    // TODO for Duckie: Implement method to save and load game state
}