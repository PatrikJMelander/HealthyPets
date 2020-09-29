
import javax.swing.*;

/**
 * Created by Patrik Melander
 * Date: 2020-09-25
 * Time: 12:58
 * Project: HealthyPets
 * Copyright: MIT
 */
public class Snake extends Animal implements IFood{
    public Snake(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void giveFood() {
        JOptionPane.showMessageDialog(null, super.getName() + " ska matas med "+ Portion.SNAKEFOOD.getDigit() +  "g ormpellets");
    }
}
