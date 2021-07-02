public class Position {
    private String distance;
    private int value;

    public Position(String distance, int value) {
        this.distance = distance;
        this.value = value;
    }

    public String getDistance() { return this.distance; }
    public void setDistance() {
        this.distance += "-";
    }
    public int getIntegerDistance() {
        return value;
    }
    public void setIntegerDistance() {
        this.value += 1;
    }
}