package racingcar.step3;

import java.util.Random;

public class RandomNumber {
    public static int makeRandomNumber(){
        Random random = new Random();
        return random.nextInt(10);
    }

}
