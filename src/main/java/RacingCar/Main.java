package RacingCar;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();

        RacingCar racingCar = new RacingCar();
        racingCar.initCars(inputView.carCount());
        racingCar.initTryCnt(inputView.tryCount());

        ResultView resultView = new ResultView(racingCar);
        resultView.printCar();
    }
}
