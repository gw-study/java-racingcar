public class Position {
    private int distance;

    public Position(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
    public void increaseDistance() {
        this.distance += 1;
    }
}