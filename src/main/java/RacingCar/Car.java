package RacingCar;

public class Car {
    private final CarName carName;

    private int curPosition = 0;

    public Car(String carName) {
        this.carName = new CarName(carName);
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.isMove()) {
            ++curPosition;
        }
    }

    public int getCurPosition() {
        return curPosition;
    }

    public String getCarName() {
        return carName.getCarName();
    }

}
