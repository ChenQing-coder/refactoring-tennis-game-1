package cn.xpbootcamp.tennis.scores;

import cn.xpbootcamp.tennis.Player;

public class AdvantageScore extends AbstractScore {

    public AdvantageScore(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public boolean isApplied() {

        return player1.isAdvantage(player2.getScore()) || player2.isAdvantage(player1.getScore());
    }

    @Override
    public String state() {
        return player1.isAdvantage(player2.getScore()) ? "Advantage " + player1.getName() : "Advantage " + player2.getName();
    }
}
