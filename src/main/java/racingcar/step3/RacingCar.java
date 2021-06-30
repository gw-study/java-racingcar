package racingcar.step3;

import java.util.*;

public class RacingCar {
    private final String nameOfCars;
    private ArrayList<Car> infoOfCars;
    private final int countOfCars;
    private final int countOfRounds;
    private ArrayList<Integer> movementOfCar;
    private ArrayList<String> winner;
    private final int MOVE_CONDITION = 4;

    public RacingCar(String nameOfCars, int countOfRounds) {
        this.nameOfCars = nameOfCars;
        this.infoOfCars = enterNameOfCars(nameOfCars);
        this.countOfCars = infoOfCars.size();
        this.countOfRounds = countOfRounds;
        this.movementOfCar = new ArrayList<>();
        this.winner = new ArrayList<>();
    }

    public String getNameOfCars(){
        return nameOfCars;
    }

    public int getCountOfCars(){
        return countOfCars;
    }

    public int getCountOfRounds(){
        return countOfRounds;
    }

    public ArrayList<Car> getInfoOfCars(){
        return infoOfCars;
    }

    public ArrayList<Integer> getMovementOfCar(){
        return movementOfCar;
    }

    public ArrayList<String> getWinner(){
        return winner;
    }

    public void race(RacingCar racingCar) {
        for (int i=0; i < countOfCars; i++){
            racingCar.move(i);
            movementOfCar.add(getInfoOfCars().get(i).getPositionOfCar());
        }
    }

    public void move(int i) {
        if (RandomNumber.makeRandomNumber() >= MOVE_CONDITION) {
            getInfoOfCars().get(i).moveCar();
        }
    }

    public ArrayList<Car> enterNameOfCars(String nameOfCars){
        String[] namesOfCar = nameOfCars.split(",");
        infoOfCars = new ArrayList<>();
        for (int i=0; i < namesOfCar.length; i++){
            infoOfCars.add(new Car(namesOfCar[i], 0));
        }
        return infoOfCars;
    }

    public ArrayList<String> findWinner(ArrayList<Car> infoOfCars){
        winner = new ArrayList<>();
        int[] position = new int[countOfCars];
        for (int i=0; i < countOfCars; i++){
            position[i] = infoOfCars.get(i).getPositionOfCar();
        }
        Arrays.sort(position);
        int max = position[countOfCars-1];
        for (int i=0; i < countOfCars; i++) {
            addWinner(max, i);
        }
        return winner;
    }

    public void addWinner(int max, int i){
        if(infoOfCars.get(i).getPositionOfCar() == max){
            winner.add(infoOfCars.get(i).getNameOfCar());
        }
    }
}
