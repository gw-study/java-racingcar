package RacingCar.domain;

public class CarName {
    private final int NAME_LIMIT = 5;
    private final String carName;

    public CarName(String carName) {
        this.carName = carName.trim();
        if (this.carName.length() > NAME_LIMIT) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다");
        }
    }

    public String getCarName() {
        return carName;
    }
}
