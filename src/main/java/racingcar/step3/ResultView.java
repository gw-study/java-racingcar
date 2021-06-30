package racingcar.step3;

import java.util.ArrayList;

public class ResultView {

    public void resultView(RacingCar racingCar) {
        System.out.println();
        System.out.println("실행 결과");
        for (int i=0; i < racingCar.getCountOfRounds(); i++){
            printNumberOfCars(racingCar);
        }
        for (int i=0; i < racingCar.getWinner().size()-1; i++){
            System.out.print(racingCar.getWinner().get(i)+", ");
        }
        System.out.println(racingCar.getWinner().get(racingCar.getWinner().size()-1)+"가 최종 우승했습니다.");
    }

    public void printNumberOfCars(RacingCar racingCar) {
        for (int i=0; i < racingCar.getCountOfCars(); i++){
            System.out.print(racingCar.getInfoOfCars().get(i).getNameOfCar()+" : ");
            printNumberOfMovement((Integer) racingCar.getMovementOfCar().remove(0));
        }
        System.out.println();
    }

    public void printNumberOfMovement(int numberOfMovement){
        for (int i=0; i < numberOfMovement; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}
