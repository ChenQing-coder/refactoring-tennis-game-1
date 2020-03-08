package cn.xpbootcamp.tennis.scores;

import cn.xpbootcamp.tennis.Player;

public class RegularScore extends AbstractScore {

    public RegularScore(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public boolean isApplied() {
        return true;
    }

    @Override
    public String state() {
        return getScoreState(player1.getScore()) + "-" + getScoreState(player2.getScore());
    }
}
