public class Position {
    String distance;
    int value;

    public Position(String distance, int value) {
        this.distance = distance;
        this.value = value;
    }

    public String getDistance() {
        return distance;
    }

    public int getIntegerDistance() {
        return value;
    }

    public void setDistance() {
        this.distance += "-";
    }

    public void setIntegerDistance() {
        this.value += 1;
    }
}