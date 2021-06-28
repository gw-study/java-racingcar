import java.util.Scanner;

public class InputView {
    private final static String QUESTION_ABOUT_NAME_OF_CARS = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private final static String QUESTION_ABOUT_NUMBER_OF_CARS = "자동차 대수는 몇 대 인가요?";
    private final static String QUESTION_ABOUT_NUMBER_OF_TIMES = "시도할 회수는 몇 회 인가요?";
    private Scanner sc = new Scanner(System.in);

    public String[] inputNameOfCars() {
        System.out.println(QUESTION_ABOUT_NAME_OF_CARS);
        return isValidString(sc.nextLine());
    }

    public int inputNumberOfTimes() {
        System.out.println(QUESTION_ABOUT_NUMBER_OF_TIMES);
        return isValidInput(sc.nextLine());
    }

    public int isValidInput(String input) throws NullPointerException {
        String regex = "^[0-9]+$";

        if (!input.matches(regex)) {
            throw new NullPointerException();
        }

        return Integer.parseInt(input);
    }

    public String[] canSplit(String input) throws IllegalArgumentException {

        if (input.contains(",")) {
            String[] inputs = input.split(",");

            for (String name: inputs) {
                if (isEmpty(name)) {
                    throw new IllegalArgumentException();
                }
            }

            return inputs;
        }

        String[] name = new String[1];
        name[0] = input;

        return name;
    }

    public boolean isEmpty(String name) {
        return name.isEmpty();
    }

    public String[] isValidString(String input) {
        return canSplit(input);
    }
}