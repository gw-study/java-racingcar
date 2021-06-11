import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Calculator {

    private static final Map<String, BiFunction<Integer, Integer, Integer>> operators = new HashMap<>();

    static {
        operators.put("+", (a, b) -> a + b);
        operators.put("-", (a, b) -> a - b);
        operators.put("*", (a, b) -> a * b);
        operators.put("/", (a, b) -> a / b);
    }

    public static int operate(String operator, int a, int b) {
        if (!operators.containsKey(operator)) {
            throw new IllegalArgumentException("사칙 연산 기호가 아닙니다");
        }

        return operators.get(operator).apply(a, b);
    }


    public int calculate(String input) {

        if (isBlank(input)) {
            throw new IllegalArgumentException("input data is blank or null");
        }

        String[] inputArr = input.split(" ");
        int len = inputArr.length;
        int value = Integer.parseInt(inputArr[0]);

        for (int i = 1; i < len; i += 2) {
            value = operate(inputArr[i], value, Integer.parseInt(inputArr[i + 1]));
        }

        return value;
    }

    private boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }
}
