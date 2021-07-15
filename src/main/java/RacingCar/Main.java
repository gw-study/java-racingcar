package RacingCar;

import RacingCar.domain.RacingCar;
import RacingCar.domain.RacingResultCars;
import RacingCar.domain.WinnerCars;
import RacingCar.view.InputView;
import RacingCar.view.ResultView;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        RacingCar racingCar = new RacingCar(inputView.inputCarName(), inputView.tryCount());
        RacingResultCars racingResultCars = new RacingResultCars();

        while (racingCar.racing()) {
            racingResultCars.addRacingResult(racingCar.start());
        }

        ResultView resultView = new ResultView(racingResultCars);
        resultView.printResult();
        WinnerCars winnerCars = new WinnerCars(racingResultCars.getLastCarList());
        resultView.printWinner(winnerCars.findWinnerCarList());

    }
}
