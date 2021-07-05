package racingcar.step3;

import java.util.ArrayList;

public class RacingCar {
    private static final int MOVE_CONDITION = 4;
    private final int countOfRounds;
    private ArrayList<Car> infoOfCars;
    private ArrayList<Integer> movementOfCar;

    public RacingCar(String nameOfCars, int countOfRounds) {
        this.infoOfCars = enterNameOfCars(nameOfCars);
        this.countOfRounds = countOfRounds;
        this.movementOfCar = new ArrayList<>();
    }

    public ArrayList<Car> getInfoOfCars() {
        return infoOfCars;
    }

    public int getCountOfRounds() {
        return countOfRounds;
    }

    public int getCountOfCars() {
        return infoOfCars.size();
    }

    public ArrayList<Integer> getMovementOfCar() {
        return movementOfCar;
    }

    private ArrayList<Car> enterNameOfCars(String nameOfCars) {
        String[] namesOfCar = nameOfCars.split(",");
        infoOfCars = new ArrayList<>();
        for (String carName : namesOfCar) {
            infoOfCars.add(new Car(carName, 0));
        }
        return infoOfCars;
    }

    public void race(RacingCar racingCar) {
        for (int i = 0; i < infoOfCars.size(); i++) {
            racingCar.move(i, RandomNumber.makeRandomNumber());
            infoOfCars.get(i).addPositionOfCar(movementOfCar);
        }
    }

    public void move(int i, int randomNumber) {
        if (randomNumber >= MOVE_CONDITION) {
            infoOfCars.get(i).moveCar();
        }
    }
}
