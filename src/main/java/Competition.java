public class Competition {
    public static void main(String[] args) {
        InputView inputView = new InputView();

        String[] names = inputView.inputNameOfCars();
        int times = inputView.inputNumberOfTimes();

        RacingCarCompetition competition = new RacingCarCompetition(names);
        competition.ready(times);

        ResultView resultView = new ResultView(competition.history);
        resultView.showResultsMessage();

        resultView.getHistories();
        resultView.showWinner(competition.getWinners());
    }
}
