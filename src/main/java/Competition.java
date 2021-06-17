public class Competition {
    public static void main(String[] args) {

        InputView inputView = new InputView();

        RacingCarCompetition competition = new RacingCarCompetition();
        competition.numberOfCar = inputView.inputNumberOfCar();
        competition.numberOfTimes = inputView.inputNumberOfTimes();
        competition.readyForCompetition();

        ResultView resultView = new ResultView(competition);
        resultView.showDistance();
    }
}
