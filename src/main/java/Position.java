public class Position {
    public String distance;
    public int value;

    public Position(String distance, int value) {
        this.distance = distance;
        this.value = value;
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