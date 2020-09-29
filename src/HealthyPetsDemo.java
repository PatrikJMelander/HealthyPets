
import javax.swing.*;
import java.util.*;

/**
 * Created by Patrik Melander
 * Date: 2020-09-25
 * Time: 13:03
 * Project: HealthyPets
 * Copyright: MIT
 *
 * Program that helps the staff in a Pets hotel to know how mutch ant what sort of
 * food thay should give.
 */
public class HealthyPetsDemo {
    public static void main(String[] args) {
        HealthyPetsDemo healthyPetsDemo = new HealthyPetsDemo();

    }

    public HealthyPetsDemo() {
        //Blev intresserad av HashMap när du nämnde det förra lektionen
        // så kollade denna film för att implementera det i denna uppgift
        //https://www.youtube.com/watch?v=70qy6_gw1Hc
        Map<String, Animal> animalMap = new HashMap<String, Animal>();
        animalMap.put("sixten",new Dog("Sixten", 5.0));
        animalMap.put("dogge", new Dog("Dogge", 10.0));
        animalMap.put("venus", new Cat("Venus", 5.0));
        animalMap.put("ove", new Cat("Ove", 3.0));
        animalMap.put("hypno", new Snake("Hypno", 1.0));

        while (true){
            String input;
            int answer;
            input = JOptionPane.showInputDialog("Vilket djur ska få mat? (ange namn)",JOptionPane.QUESTION_MESSAGE);
            if (input == null)
                break;

            try{
                input = input.toLowerCase();
                //Här använder jag mig av polymorfism
                animalMap.get(input).giveFood();

                answer = JOptionPane.showConfirmDialog(null, "Vill du ge fler djur mat?");
                if (answer != 0) {
                    break;
                }

            }catch (NullPointerException e){
                answer = JOptionPane.showConfirmDialog(null, input + " bor inte här just nu, vill du se en lista på" +
                        " djuren som bor på hotelet?");
                if (answer == 0)
                    JOptionPane.showMessageDialog(null, (animalMap.values()));
                else if (answer == 1)
                    System.out.println("Då får du försöka igen");
                else
                    System.exit(0);
            }
        }


    }

}

