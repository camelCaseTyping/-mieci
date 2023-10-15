import java.util.Scanner;

public class Game {
    private Player player;
    private Player npc;
    private Dice dice;
    private final int dices = 2; // The number of dice the player rolls

    public Game() {
        this.player = new Player("You");
        this.npc = new Player("NPC");
        this.dice = new Dice();
    }

    /**
     * @
     */
    public void playGame() {

        while (this.player.canPlayGame() && this.npc.canPlayGame()) {


            int highestBet = player.getCash() > npc.getCash() ? npc.getCash() : player.getCash();
            System.out.println("Your cash: " + player.getCash() + " |||  NPC cash: " + npc.getCash());
            System.out.println("Your highest possible bet is " + highestBet);
            System.out.println("What's your bet?");




            try {
                Scanner sc = new Scanner(System.in);
                int userBet = sc.nextInt();
                if(npc.canBet(userBet) && player.canBet(userBet)){
                    duel(userBet);
                }
            }
            catch (Exception e) {
                System.out.println("Invalid bet");

            }


            System.out.println();

        }

        System.out.println("Good game");
        if(player.getCash() > npc.getCash())
            System.out.println("You win the game");
        else
            System.out.println("NPC win the game");
    }

    public void duel(int bet)
    {
        int userScore = 0;
        int computerScore = 0;
        for (int i = 0; i < dices; i++) {
            userScore += dice.diceThrow();
            computerScore += dice.diceThrow();
        }

        System.out.println("Your score:" + userScore + " | computer score:" + computerScore);

        if (userScore > computerScore) {
            player.addCash(bet);
            npc.subtractCash(bet);
            System.out.println("good job you won that round! ");
        } else if (userScore < computerScore) {
            npc.addCash(bet);
            player.subtractCash(bet);
            System.out.println("Oh no we lose that round :( ");
        }
        else{
            System.out.println("It's draw. Nothing happened.");
        }



    }


}
