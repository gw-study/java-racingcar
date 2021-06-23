package racingcar.step3;

import java.util.Scanner;

public class InputView {

    public static RacingCar inputView() {
        Scanner scanner = new Scanner(System.in);
        int countOfCars = inputCar(scanner);
        int countOfRounds = inputNumber(scanner);
        return new RacingCar(countOfCars, countOfRounds);
    }

    private static int inputCar(Scanner scanner){
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    private static int inputNumber(Scanner scanner){
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}
