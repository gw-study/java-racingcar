public class Calculator {

    int plus(int no1, int no2){
        return no1 + no2;
    }

    int minus(int no1, int no2){
        return no1 - no2;
    }

    int multiply(int no1, int no2){
        return no1 * no2;
    }

    int divide(int no1, int no2){
        return no1 / no2;
    }

    String[] stringSplit(String calculateString){
        String[] splitString = calculateString.split(" ");
        if( splitString.length == 0 ){
            throw new IllegalArgumentException("입력 값이 빈 공백 문자입니다.");
        } else if( splitString.length < 3 ){
            throw new IllegalArgumentException("입력 값이 올바르지 않습니다.");
        }
        return splitString;
    }

    int[] splitStringToInt(String[] splitString){
        int[] splitStringToInt = new int[splitString.length];
        for( int i=0 ; i < splitString.length ; i+=2 ){
            splitStringToInt[i] = Integer.parseInt(splitString[i]);
        }
        return splitStringToInt;
    }


    int stringCalculator(String input){
        String calculateString = input;
        String[] splitString = stringSplit(calculateString);
        int[] splitStringToInt = splitStringToInt(splitString);

        for( int i=1 ; i < splitString.length ; i+=2 ){
            if( splitString[i].equals("+") ){
                splitStringToInt[i+1] = plus(splitStringToInt[i-1], splitStringToInt[i+1]);
            } else if( splitString[i].equals("-") ){
                splitStringToInt[i+1] = minus(splitStringToInt[i-1], splitStringToInt[i+1]);
            } else if( splitString[i].equals("*") ){
                splitStringToInt[i+1] = multiply(splitStringToInt[i-1], splitStringToInt[i+1]);
            } else if( splitString[i].equals("/") ){
                splitStringToInt[i+1] = divide(splitStringToInt[i-1], splitStringToInt[i+1]);
            } else if( splitString[i] == null || splitString[i].isEmpty() ){
                throw new IllegalArgumentException("입력 값이 null입니다.");
            } else{
                throw new IllegalArgumentException("사칙연산 기호가 아닙니다.");
            }
        }
        return splitStringToInt[splitString.length-1];
    }
}
