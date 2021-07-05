package racingcar;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        inputView.inputCarRacingEvent();
        ResultView resultView = new ResultView();

        Racing racing = new Racing(inputView.getCars());
        resultView.startResult();
        for(int i = 0; i < inputView.getTryCount(); i++){
            resultView.showRacingCarResult(racing.moveCars());
        }
        Winners winners = new Winners(racing.getCars());
        List<Car> winnersCar = winners.winnerCars();
        resultView.printWinners(winners.findWinnerCarNames(winnersCar));
    }
}
