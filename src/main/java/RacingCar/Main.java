package RacingCar;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        RacingCar racingCar = new RacingCar(inputView.inputCarName(), inputView.tryCount());
        ResultView resultView = new ResultView();

        while (racingCar.racing()) {
            resultView.printCar(racingCar.start());
        }

        WinnerCars winnerCars = new WinnerCars(racingCar.getCarList());
        resultView.printWinner(winnerCars.findWinnerCarList());

    }
}
