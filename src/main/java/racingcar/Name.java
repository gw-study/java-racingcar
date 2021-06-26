package racingcar;

public class Name {
    public static final int MAX_NAME_LENGTH = 5;
    private final String name;

    public Name(String name){
        if(name.length() > MAX_NAME_LENGTH)
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");

        this.name = name.trim();
    }
    public String name(){
        return name;
    }
}
