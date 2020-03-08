package cn.xpbootcamp.tennis.scores;

import cn.xpbootcamp.tennis.Player;

public class EqualScore extends AbstractScore {

    public EqualScore(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public boolean isApplied() {
        return player1.isEqual(player2.getScore());
    }

    @Override
    public String state() {
        int score = player1.getScore();
        if (score > 2) {
            return "Deuce";
        } else {
            return getScoreState(score) + "-All";
        }
    }
}
