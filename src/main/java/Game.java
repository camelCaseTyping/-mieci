public class Game {
    private Player player;
    private Player npc;
    private Dice dice;

    public Game(Player prayer, Player npc, Dice dice) {
        this.player = new Player("You");
        this.npc = new Player("NPC");
        this.dice = new Dice();
    }

    public void playGame() {

        while (this.player.canPlayGame() && this.npc.canPlayGame()) {


            int highestBet = player.getCash() > npc.getCash() ? npc.getCash() : player.getCash();
            System.out.println("Your highest possible bet is " + highestBet);
            System.out.println("What's your bet?");

            int userBet;

        }

        System.out.println("Good game");
        if(player.getCash() > npc.getCash())
            System.out.println("You win the game");
        else
            System.out.println("NPC win the game");
    }


}
