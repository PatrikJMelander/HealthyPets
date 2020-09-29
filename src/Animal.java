
/**
 * Created by Patrik Melander
 * Date: 2020-09-25
 * Time: 09:12
 * Project: HealthyPets
 * Copyright: MIT
 */
public class Animal implements IFood {
    //Här under kapslar jag in de två Instansvariablarna
    //så man inte kan komma åt och ändra dem utan att använda metoderna
    //get/set
    //Jag har valt att inte ha någon set-metod för namn då de inte bör ändras

    //Instansvariabler
    //Här har jag inkapslat instansvariablar
    private String name;
    private double weight;



    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void giveFood() {    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  name;
    }
}
