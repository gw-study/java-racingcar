package RacingCar;

public class ResultView {
    private final RacingCar racingCar;

    public ResultView(RacingCar racingCar) {
        this.racingCar = racingCar;
    }

    public void printCar() {
        System.out.println();
        System.out.println("실행 결과");
        for (int i = 0; i < racingCar.tryCnt; i++) {
            System.out.println();
            for (Car car : racingCar.start()) {
                System.out.println(car.getCurPosition());
            }
        }
    }
}
