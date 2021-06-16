public class RacingCar {
    public static void main(String[] args) {
        InputView inputView = new InputView();

        Car car = new Car();
        car.racingStart(inputView.carCount(), inputView.tryCount());
    }
}
