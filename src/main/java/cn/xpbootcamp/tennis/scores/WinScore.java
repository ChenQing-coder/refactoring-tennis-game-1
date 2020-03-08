package cn.xpbootcamp.tennis.scores;

import cn.xpbootcamp.tennis.Player;

public class WinScore extends AbstractScore {

    public WinScore(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public boolean isApplied() {

        return player1.isWin(player2.getScore()) || player2.isWin(player1.getScore());
    }

    @Override
    public String state() {
        return player1.isWin(player2.getScore()) ? "Win for " + player1.getName() : "Win for " + player2.getName();
    }
}
