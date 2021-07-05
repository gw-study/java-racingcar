package racingcar.step3;

import java.util.ArrayList;

public class Car {
    private final String nameOfCar;
    private int positionOfCar;

    public Car(String nameOfCar, int positionOfCar) {
        this.nameOfCar = nameOfCar;
        this.positionOfCar = positionOfCar;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public int getPositionOfCar() {
        return positionOfCar;
    }

    public void moveCar() {
        positionOfCar++;
    }

    public void addPositionOfCar(ArrayList<Integer> movementOfCar) {
        movementOfCar.add(positionOfCar);
    }

    public void addNameOfCarToWinner(ArrayList<String> winner) {
        winner.add(nameOfCar);
    }

}
