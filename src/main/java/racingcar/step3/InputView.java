package racingcar.step3;

import java.util.Scanner;

public class InputView {

    public RacingCar inputView() {
        Scanner scanner = new Scanner(System.in);
        String nameOfCars = inputCar(scanner);
        int countOfRounds = inputNumber(scanner);
        return new RacingCar(nameOfCars, countOfRounds);
    }

    private String inputCar(Scanner scanner){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.next();
    }

    private int inputNumber(Scanner scanner){
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}
