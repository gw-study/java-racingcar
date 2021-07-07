package racingcar.step3;

import java.util.ArrayList;
import java.util.Arrays;

public class Winner {
    private ArrayList<String> winner;
    private ArrayList<Car> infoOfCars;

    public Winner() {
        this.winner = new ArrayList<>();
    }

    public ArrayList<String> getWinner() {
        return winner;
    }

    public void findWinner(RacingCar racingCar) {
        infoOfCars = racingCar.getInfoOfCars();
        int countOfCars = infoOfCars.size();
        int[] position = new int[countOfCars];
        for (int i = 0; i < countOfCars; i++) {
            position[i] = infoOfCars.get(i).getPositionOfCar();
        }
        Arrays.sort(position);
        int max = position[countOfCars - 1];
        for (int i = 0; i < countOfCars; i++) {
            addWinner(max, i);
        }
    }

    private void addWinner(int max, int i) {
        if (infoOfCars.get(i).getPositionOfCar() == max) {
            infoOfCars.get(i).addNameOfCarToWinner(winner);
        }
    }
}
