package classes.base;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Herbivore extends Animal {
    public static CopyOnWriteArrayList<Animal> instances = new CopyOnWriteArrayList<Animal>();

    public Herbivore() {
        instances.add(this);
    }

    public static CopyOnWriteArrayList<Animal> getStaticInstances() {
        return instances;
    }

    public CopyOnWriteArrayList<Animal> getInstances() {
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

    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
