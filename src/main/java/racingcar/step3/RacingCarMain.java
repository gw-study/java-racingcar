package racingcar.step3;

public class RacingCarMain {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        RacingCar racingCar = inputView.inputView();
        for (int i=0; i < racingCar.getCountOfRounds(); i++){
            racingCar.race(racingCar);
        }
        racingCar.findWinner(racingCar.getInfoOfCars());
        ResultView resultView = new ResultView();
        resultView.resultView(racingCar);
    }
}
