package racingcar.domain;

import java.util.Objects;

public class Car {
    private static final int MOVABLE_NUMBER = 4;

    private final Name name;
    private Position position;

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public int moveForward(int value){
        if(value >= MOVABLE_NUMBER) {
            this.position = position.increase();
        }
        return getPosition();
    }

    public String getName() {
        return name.name();
    }
    public int getPosition() {
        return position.getPosition();
    }

    public int maxPosition(int lastPosition){
        return Math.max(getPosition(), lastPosition);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
