import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Calculator {

    public enum OperationType{

        ADDITION("+", (a, b) -> a + b),
        SUBSTITUTION("-", (a, b) -> a - b),
        MULTIPLY("*", (a, b) -> a * b),
        DIVIDE("/", (a, b) -> a / b);

        private String symbol;
        private BiFunction<Integer, Integer, Integer> operation;

        OperationType(String symbol, BiFunction<Integer, Integer, Integer> operation){
            this.symbol = symbol;
            this.operation = operation;
        }

        public int operate(int a, int b){
            return operation.apply(a, b);
        }

    }

    private static Map<String, OperationType> operators = new HashMap<>();

    static {
        for (OperationType value : OperationType.values())
            operators.put(value.symbol, value);
    }

    public static int operate(String operator, int a, int b) {
        if(!operators.containsKey(operator)){
            throw new IllegalArgumentException("사칙 연산 기호가 아닙니다");
        }
        return operators.get(operator).operate(a, b);
    }

    public int calculate(String input){

        if(isBlank(input)){
            throw new IllegalArgumentException("input data is blank or null");
        }

        String[] inputArr = input.split(" ");
        int len = inputArr.length;
        int value = Integer.parseInt(inputArr[0]);

        for(int i=1; i<len; i+=2){
            value = operate(inputArr[i], value,Integer.parseInt(inputArr[i + 1]));
        }
        return value;
    }

    private boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }
}
