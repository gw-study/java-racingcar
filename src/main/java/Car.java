class Car {
    private static int LIMIT_RANDOM_NUMBER = 4;
    private String distance;

    Car(String defaultDistance) {
        distance = defaultDistance;
    }

    public void showDistance() {
        System.out.println(distance);
    }

    public void move() {
        showDistance();

        int randomNumber = (int)(Math.random() * 10);
        if (randomNumber >= LIMIT_RANDOM_NUMBER) {
            distance += "-";
        }
    }
}