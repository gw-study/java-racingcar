package racingcar.step3;

import java.util.ArrayList;

public class RacingCar {
    private final int countOfCars;
    private final int countOfRounds;
    private int[] cars;
    private ArrayList movementOfCar;

    public RacingCar(int countOfCars, int countOfRounds) {
        this.countOfCars = countOfCars;
        this.countOfRounds = countOfRounds;
        this.cars = new int[countOfCars];
        this.movementOfCar = new ArrayList<>();
    }

    public int getCountOfCars(){
        return countOfCars;
    }

    public int getCountOfRounds(){
        return countOfRounds;
    }

    public int[] getCars(){
        return cars;
    }

    public ArrayList getMovementOfCar(){
        return movementOfCar;
    }
}
