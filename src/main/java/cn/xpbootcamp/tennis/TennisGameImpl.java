
package cn.xpbootcamp.tennis;

import java.util.Arrays;

public class TennisGameImpl implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;
    private Player player1;
    private Player player2;

    public TennisGameImpl(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1") {
            player1Score += 1;
        } else {
            player2Score += 1;
        }
    }

    public String getScore() {
        if (player1Score == player2Score) {
            return getScoreWhenEqual();
        } else if (player1Score >= 4 || player2Score >= 4) {
            return getScoreWhenMoreThanFour();
        } else {
            return getScoreRegular();
        }
    }

    private String getScoreRegular() {
        return getScoreState(player1Score) + "-" + getScoreState(player2Score);
    }



    private String getScoreWhenMoreThanFour() {
        int minusResult = player1Score - player2Score;
        String winner = minusResult > 0 ? player1.getName() : player2.getName();
        return Math.abs(minusResult) == 1 ? "Advantage " + winner : "Win for " + winner;

    }

    private String getScoreWhenEqual() {
        if (player1Score > 2) {
            return "Deuce";
        } else {
            return getScoreState(player1Score) + "-All";
        }
    }
}