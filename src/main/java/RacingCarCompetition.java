import java.util.Scanner;

public class RacingCarCompetition {

    private int numberOfCar;
    private int numberOfTimes;

    private InputView inputView = new InputView();
    private ResultView resultView;

    Car[] cars;

    RacingCarCompetition() {
        readyForCompetition();
    }

    public static void main(String[] args) {
        RacingCarCompetition competition = new RacingCarCompetition();
    }

    public void readyForCompetition() {
        numberOfCar = inputView.inputNumberOfCar();
        numberOfTimes = inputView.inputNumberOfTimes();

        readForCar();
        startRacing();
    }

    public void readForCar() {
        cars = new Car[numberOfCar];

        for (int i = 0; i < numberOfCar; i++) {
            cars[i] = new Car("-");
        }
    }

    public void startRacing() {
        resultView = new ResultView();

        for (int i = 0; i < numberOfTimes; i++) {
            for (Car car : cars) {
                car.move();
            }
            System.out.println();
        }
    }
}
