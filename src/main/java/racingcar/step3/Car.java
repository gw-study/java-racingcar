package racingcar.step3;

public class Car {
    private final String nameOfCar;
    private int positionOfCar;

    public Car(String nameOfCar, int positionOfCar) {
        this.nameOfCar = nameOfCar;
        this.positionOfCar = positionOfCar;
    }

    public String getNameOfCar(){
        return nameOfCar;
    }

    public int getPositionOfCar(){
        return positionOfCar;
    }

    public void moveCar(){
        positionOfCar++;
    }

}
