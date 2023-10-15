public class Player {
    private String name;
    private int cash;

    public Player(String name) {
        this.cash = 100;
        this.name = name;
    }


    /**
     * @return Czy gra jest możliwa do rozegrania
     */
    public boolean canPlayGame() {
        if (this.cash > 0 )
            return true;
        else
            return false;
    }

    /**
     *
     * @param amountOfMoney kwota za jaką gracz chce grać
     * @return Czy zakład jest możliwy dla gracza
     */
    public boolean canBet (int amountOfMoney){
        if (amountOfMoney > this.cash) {
            System.out.println("You can't bet that high. "
                    + this.name + " have only " + this.cash + " left.");
            return false;
        } else if (amountOfMoney <= 0) {
            System.out.println("Unfortunately, this amount is too small");
            return false;
        }

        return true;

    }

    public int getCash() {
        return cash;
    }

    public String getName() {
        return name;
    }


}
