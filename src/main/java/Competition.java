public class Competition {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        String[] names = inputView.inputNameOfCars();
        int times = inputView.inputNumberOfTimes();

        RacingCarCompetition competition = new RacingCarCompetition(names);
        resultView.showResultsMessage();

        for (int i = 0 ; i < times; i++) {
            competition.start();
            resultView.showPositions(competition.getCars());
        }

        resultView.showWinner(competition.getWinners());
    }
}
