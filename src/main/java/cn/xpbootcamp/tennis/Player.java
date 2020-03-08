package cn.xpbootcamp.tennis;

public class Player {
    String name;
    int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void wonScore() {
        score++;
    }

    public boolean isEqual(int anotherScore) {
        return score == anotherScore;
    }

    public boolean isAdvantage(int anotherScore) {
        return score >= 4 && score - anotherScore == 1;
    }

    public boolean isWin(int anotherScore) {
        return score >= 4 && score - anotherScore >= 2;
    }
}
