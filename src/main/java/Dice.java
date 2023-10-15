import java.util.Random;

public class Dice {
    private final int sides = 6;
    private Random randomThrow = new Random();

    public int diceThrow() {
        return randomThrow.nextInt(sides + 1);
    }



}
