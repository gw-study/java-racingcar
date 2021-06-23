package racingcar.step3;

import java.util.ArrayList;

public class ResultView {

    public static void resultView(RacingCar racingCar, ArrayList movementOfCar) {
        System.out.println();
        System.out.println("실행 결과");
        for (int i=0; i < racingCar.getCountOfRounds(); i++){
            printNumberOfCars(racingCar, movementOfCar);
        }
    }

    public static void printNumberOfCars(RacingCar racingCar, ArrayList movementOfCar) {
        for (int i=0; i < racingCar.getCountOfCars(); i++){
            printNumberOfMovement((Integer) movementOfCar.remove(0));
        }
        System.out.println();
    }

    public static void printNumberOfMovement(int numberOfMovement){
        for (int i=0; i < numberOfMovement; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}
