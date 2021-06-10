import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public enum Operator {
    PLUS("+", (a, b) -> a + b),
    MINUS("-", (a, b) -> a - b),
    MULTIPLY("*", (a, b) -> a * b),
    DIVIDE("/", (a, b) -> a / b);

    private final String operator;
    private final IntBinaryOperator intBinaryOperator;

    Operator(String operator, IntBinaryOperator intBinaryOperator) {
        this.operator = operator;
        this.intBinaryOperator = intBinaryOperator;
    }

    protected static int calculate(int a, int b, String sign) {
        Operator operator = Arrays.stream(values())
                .filter(v -> v.operator.equals(sign))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);

        return operator.intBinaryOperator.applyAsInt(a, b);
    }
}
