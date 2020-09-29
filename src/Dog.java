import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Created by Patrik Melander
 * Date: 2020-09-25
 * Time: 12:57
 * Project: HealthyPets
 * Copyright: MIT
 */
public class Dog extends Animal implements IFood{


    public Dog(String name, double weight) {

        super(name, weight);
    }


    @Override
    public void giveFood() {
        ImageIcon imageDog = new ImageIcon("Dog.jpg");
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double portion;
        portion= (super.getWeight()*1000)/ Portion.DOGFOOD.getDigit();
        JOptionPane.showMessageDialog(null, super.getName() + " ska matas med " + decimalFormat.format(portion) + " gram hundmat", "Matar", JOptionPane.INFORMATION_MESSAGE,imageDog);
    }



}
