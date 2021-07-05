package racingcar;

import java.util.Objects;

public class Car {
    private static final int MOVABLE_NUMBER = 4;
    private final Name name;
    private int currentPosition = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return currentPosition == car.currentPosition && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, currentPosition);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.currentPosition = position;
    }

    public int moveForward(int value){
        if(value >= MOVABLE_NUMBER) {
            currentPosition++;
        }
        return currentPosition;
    }

    public String getName() {
        return name.name();
    }
    public int getPosition() {
        return currentPosition;
    }

    public int maxPosition(int lastPosition){
        return Math.max(currentPosition, lastPosition);
    }
}
