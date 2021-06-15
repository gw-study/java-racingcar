package racingcar.step3;

public class RacingCarMain {

    public static void main(String[] args) {
        RacingCar racingCar = InputView.inputView();
        racing(racingCar);
    }

    public static void racing(RacingCar racingCar) {
        int[] cars = racingCar.getRacingCars();
        ResultView.resultViewStart();
        for (int i=0; i < racingCar.getRacingNumberInput(); i++){
            racingOnce(racingCar, cars);
            ResultView.resultView(cars, i);
        }
    }

    public static void racingOnce(RacingCar racingCar, int[] cars) {
        for (int i=0; i < racingCar.getRacingCarInput(); i++){
            if (RandomNumber.makeRandomNumber() >= 4) {
                cars[i]++;
            }
        }
    }
}
