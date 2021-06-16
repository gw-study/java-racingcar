import java.util.Random;

public class Car {
    private static final int RANDOM_LIMIT_NUM = 4;

    public int makeRandom() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public String addMove(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append("-");
        return stringBuilder.toString();
    }

    public String[] initArray(String[] stringArr) {
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = "";
        }
        return stringArr;
    }

    public void racingStart(int carCnt, int tryCnt) {
        String[] carArray = new String[carCnt];
        ResultView resultView = new ResultView();

        carArray = initArray(carArray);

        for (int i = 0; i < tryCnt; i++) {
            for (int j = 0; j < carArray.length; j++) {
                if (makeRandom() >= RANDOM_LIMIT_NUM) {
                    carArray[j] = addMove(carArray[j]);
                }
            }
            resultView.printCar(carArray);
        }
    }
}
