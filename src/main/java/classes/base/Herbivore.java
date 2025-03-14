package classes.base;
import java.util.ArrayList;

public abstract class Herbivore extends Animal {
    public static ArrayList<Herbivore> instances = new ArrayList<>();

    public Herbivore() {
        instances.add(this);
    }
    public static ArrayList<Herbivore> getInstances() {
        return instances;
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

}
