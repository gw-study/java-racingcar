package racingcar.step3;

public class RacingCar {
    private final int car;
    private int[] cars;
    private final int number;

    public RacingCar(int car, int number) {
        this.car = car;
        this.number = number;
    }

    public int getRacingCarInput(){
        return car;
    }

    public int[] getRacingCars(){
        cars = new int[car];
        return cars;
    }

    public int getRacingNumberInput(){
        return number;
    }
}
