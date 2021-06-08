public final class StringCalculator {

    public String[] enterCommand(String input) throws IllegalArgumentException {
        if (isBlank(input)) {
            throw new IllegalArgumentException("Input IllegalArgument Exception");
        }

        return input.split(" ");
    }

    public int calculation(int num1, Operation operator, int num2) throws IllegalArgumentException {
        return operator.calculate(num1,num2);
    }

    public int parseInt(String str) {
        return Integer.parseInt(str);
    }

    public Boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }
}


