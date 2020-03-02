
public class CoinGame {
    private int startingCoins; // starting number of coins
    private int maxRounds; // maximum number of rounds played

    public CoinGame(int s, int r)
    {
        startingCoins = s;
        maxRounds = r;
    }

    /** Returns the number of coins (1, 2, or 3) that player 1 will spend.
     */
    public int getPlayer1Move()
    {
        return (int) (Math.random()*3 + 1);
    }

    /** Returns the number of coins (1, 2, or 3) that player 2 will spend, as described in part (a).
     *
     * You will write method getPlayer2Move, which returns the number of coins that player 2 will spend in a
     * given round of the game. In the first round of the game, the parameter round has the value 1, in the
     * second round of the game, it has the value 2, and so on. The method returns 1, 2, or 3 based on the
     * following rules.
     *
     * If round is divisible by 3, then return 3.
     * If round is not divisible by 3 but is divisible by 2, then return 2.
     * If round is not divisible by 3 and is not divisible by 2, then return 1.
     * Complete method getPlayer2Move below by assigning the correct value to result to be returned.
     *
     */
    public int getPlayer2Move(int round)
    {
        int result  = 0;
        /* TODO to be implemented in part (a) */
        return result;
    }

    /** Plays a simulated game between two players, as described in part (b).
     *
     * Write the method playGame, which simulates a game between player 1 and player 2, based on the rules and
     * example shown at the beginning of the question. Both player 1 and player 2 start the game with startingCoins
     * coins. Computer player 1 spends 1, 2, or 3 coins based on the value returned by the method getPlayer1Move().
     * Computer player 2 spends 1, 2, or 3 coins based on the value returned by the method getPlayer2Move().
     *
     * The game ends when maxRounds rounds have been played or when a player’s coin count is less than 3 at
     * the end of a round.
     *
     * At the end of the game, the winner is determined according to the following rules.
     *
     * If both players have the same number of coins at the end of the game, the method prints "tie game".
     * If player 1 has more coins than player 2, the method prints "player 1 wins".
     * If player 2 has more coins than player 1, the method prints "player 2 wins".
     * Assume that getPlayer2Move works as specified, regardless of what you wrote in part (a) .
     * You must use getPlayer1Move and getPlayer2Move appropriately to receive full credit.
     */
    public void playGame()
    {
        /* TODO to be implemented in part (b) */
    }
}
