interface Calculation {
    int calculate(int num1, int num2) throws ArithmeticException;
}

public enum Operation implements Calculation {
    PLUS("+") {
        @Override
        public int calculate(int num1, int num2) {
            return num1 + num2;
        }
    }, MINUS("-") {
        @Override
        public int calculate(int num1, int num2) {
            return num1 - num2;
        }
    }, MULTIPLE("*") {
        @Override
        public int calculate(int num1, int num2) {
            return num1 * num2;
        }
    }, DIVIDE("/") {
        @Override
        public int calculate(int num1, int num2) throws ArithmeticException {
            if (num2 == 0) {
                throw new ArithmeticException("Operator IllegalArgument Exception");
            }

            return num1/num2;
        }
    },;


    private String operator;

    Operation(String operator) {
        this.operator = operator;
    }

    public static Operation findOperator(String sign) throws IllegalArgumentException {
        for (Operation op : Operation.values()) {
            if (op.operator.equals(sign)) {
                return op;
            }
        }

        throw new IllegalArgumentException();
    }
}