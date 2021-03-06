
package cn.xpbootcamp.tennis;

import cn.xpbootcamp.tennis.scores.*;

import java.util.Arrays;
import java.util.List;

public class TennisGameImpl implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGameImpl(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (player1.getName().equals(playerName)) {
            player1.wonScore();
        } else {
            player2.wonScore();
        }
    }

    public String getScore() {
        return generateScores().stream().filter(AbstractScore::isApplied).findFirst().orElse(new EmptyScore(player1, player2)).state();
    }

    private List<AbstractScore> generateScores() {
        return Arrays.asList(
                new EqualScore(player1, player2),
                new AdvantageScore(player1, player2),
                new WinScore(player1, player2),
                new RegularScore(player1, player2)
        );
    }

}