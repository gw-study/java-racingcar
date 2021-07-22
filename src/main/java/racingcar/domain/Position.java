package racingcar.domain;

import java.util.Objects;

public class Position {
    private final int position;

    public Position(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("위치 값은 0이상이어야 합니다.");
        }
        this.position = position;
    }

    public Position increase() {
        return new Position(this.position + 1);
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
