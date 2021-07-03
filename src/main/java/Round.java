public class Round {
    private int countOfRound;

    public Round(int countOfRound) {
        this.countOfRound = countOfRound;
    }

    public boolean isContinuedRound() {
        return this.countOfRound > 0;
    }

    public void reduceRound() {
        this.countOfRound--;
    }
}
