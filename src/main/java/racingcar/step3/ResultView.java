package racingcar.step3;

public class ResultView {

    public void resultView(RacingCar racingCar, Winner winner) {
        System.out.println();
        System.out.println("실행 결과");
        for (int i = 0; i < racingCar.getCountOfRounds(); i++) {
            printNumberOfCars(racingCar);
        }
        for (int i = 0; i < winner.getWinner().size() - 1; i++) {
            System.out.print(winner.getWinner().get(i) + ", ");
        }
        System.out.println(winner.getWinner().get(winner.getWinner().size() - 1) + "가 최종 우승했습니다.");
    }

    private void printNumberOfCars(RacingCar racingCar) {
        for (int i = 0; i < racingCar.getCountOfCars(); i++) {
            System.out.print(racingCar.getInfoOfCars().get(i).getNameOfCar() + " : ");
            printNumberOfMovement((Integer) racingCar.getMovementOfCar().remove(0));
        }
        System.out.println();
    }

    private void printNumberOfMovement(int numberOfMovement) {
        for (int i = 0; i < numberOfMovement; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
