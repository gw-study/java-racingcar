package racingcar.step3;

import java.util.ArrayList;

public class RacingCarMain {
    private static final int MOVE_CONDITION = 4;

    public static void main(String[] args) {
        RacingCar racingCar = InputView.inputView();
        int[] cars = racingCar.getCars();
        ArrayList movementOfCar = racingCar.getMovementOfCar();
        for (int i=0; i < racingCar.getCountOfRounds(); i++){
            move(racingCar, cars, movementOfCar);
        }
        ResultView.resultView(racingCar, movementOfCar);
    }

    public static void move(RacingCar racingCar, int[] cars, ArrayList movementOfCar) {
        for (int i=0; i < racingCar.getCountOfCars(); i++){
            if (RandomNumber.makeRandomNumber() >= MOVE_CONDITION) {
                cars[i]++;
            }
            movementOfCar.add(cars[i]);
        }
    }
}
