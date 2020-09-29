
import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Created by Patrik Melander
 * Date: 2020-09-25
 * Time: 12:57
 * Project: HeaalthyPets
 * Copyright: MIT
 */
public class Cat extends Animal implements IFood {


    public Cat(String name, double weight) {

        super(name, weight);
    }

    @Override
    public void giveFood() {
        ImageIcon imageCat = new ImageIcon("Cat.jpeg");
        double portion;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        portion= (super.getWeight()*1000)/ Portion.CATFOOD.getDigit();
        JOptionPane.showMessageDialog(null, super.getName() + " ska matas med " + decimalFormat.format(portion) + " gram kattmat", "Matas", JOptionPane.INFORMATION_MESSAGE, imageCat);
    }
}
