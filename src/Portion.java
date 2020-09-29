
/**
 * Created by Patrik Melander
 * Date: 2020-09-28
 * Time: 09:06
 * Project: HelthyPets
 * Copyright: MIT
 */
public enum Portion {
    DOGFOOD (100),
    CATFOOD (150),
    SNAKEFOOD(20);

    private final int i;

    Portion(int i) {
        this.i = i;
    }
    Integer getDigit(){
        return i;
    }

}
