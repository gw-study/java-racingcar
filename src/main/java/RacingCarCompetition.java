public class RacingCarCompetition {

    private int numberOfCar;
    private int numberOfTimes;

    private InputView inputView = new InputView();
    private ResultView resultView;

    public Car[] cars;

    RacingCarCompetition() {
        readyForCompetition();
    }

    public void readyForCompetition() {
        numberOfCar = inputView.inputNumberOfCar();
        numberOfTimes = inputView.inputNumberOfTimes();

        cars = readyForCar();

        startRacing();
    }

    public Car[] readyForCar() {
        cars = new Car[numberOfCar];

        for (int i = 0; i < numberOfCar; i++) {
            cars[i] = new Car("-",1);
        }


        return cars;
    }

    public void startRacing() {

        resultView = new ResultView();

        for (int i = 0; i < numberOfTimes; i++) {
            for (Car car : cars) {
                car.move(car.getRandomNumber());
            }
            System.out.println();
        }
    }
}
