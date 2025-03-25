package classes.base;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public abstract class Herbivore extends Animal {
    public static ArrayList<Animal> instances = new ArrayList<>();

    public Herbivore() {
        instances.add(this);
    }

    public static ArrayList<Animal> getStaticInstances() {
        return instances;
    }

    public ArrayList<Animal> getInstances() {
        return instances;
    }

    public Herbivore(ArrayList<Integer> coords) {
        instances.add(this);
        super.setCoords(coords);
//        System.out.println("Новый травоед создан " + this.getCoords()+ "размер списка травоедов "+ this.getInstances().size());
    }

    @Override
    public void setSatietyAmount(int satietyAmount) {
        if (satietyAmount > 100) this.satietyAmount = 100;
        else this.satietyAmount = satietyAmount;
    }

        //    private int howMuchTickCouldLiveWithoutSaturation = 30;
//
//    public int getHowMuchTickCouldLiveWithoutSaturation() {
//        return howMuchTickCouldLiveWithoutSaturation;
//    }
//
//    public void decrementHowMuchTickCouldLiveWithoutSaturation() {
//        howMuchTickCouldLiveWithoutSaturation--;
//    }
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
