import java.util.List;

public class Competition {
    public static void main(String[] args) {
        InputView inputView = new InputView();

        RacingCarCompetition competition = new RacingCarCompetition(inputView.inputNameOfCars(), inputView.inputNumberOfTimes());

        List<Car[]> results = competition.startRacing();
        List<Car> winners = competition.getWinner();

        ResultView resultView = new ResultView(results, winners);
        resultView.showDistance();
        resultView.showWinner();
    }
}
