package classes.utils;
import classes.herbivores.*;
import classes.plants.Grass;
import classes.predators.*;

import java.util.HashMap;

public class ChanceToBeEatenConfig {
    private static final HashMap<String, HashMap<String, Integer>> chanceToBeEatenConfig = new HashMap<>() {{
        put(Wolf.class.getName(), new HashMap<>() {{
            put(Horse.class.getName(), 10);
            put(Deer.class.getName(), 15);
            put(Rabbit.class.getName(), 60);
            put(Mouse.class.getName(), 80);
            put(Goat.class.getName(), 60);
            put(Sheep.class.getName(), 70);
            put(Boar.class.getName(), 15);
            put(Buffalo.class.getName(), 10);
            put(Rabbit.class.getName(), 60);
            put(Duck.class.getName(), 40);
        }});
        put(Snake.class.getName(), new HashMap<>() {{
            put(Fox.class.getName(), 15);
            put(Rabbit.class.getName(), 20);
            put(Mouse.class.getName(), 40);
            put(Duck.class.getName(), 10);
        }});
        put(Fox.class.getName(), new HashMap<>() {{
            put(Rabbit.class.getName(), 70);
            put(Mouse.class.getName(), 90);
            put(Duck.class.getName(), 60);
            put(Caterpillar.class.getName(), 40);
        }});
        put(Bear.class.getName(), new HashMap<>() {{
            put(Snake.class.getName(), 80);
            put(Horse.class.getName(), 40);
            put(Deer.class.getName(), 80);
            put(Rabbit.class.getName(), 80);
            put(Mouse.class.getName(), 90);
            put(Goat.class.getName(), 70);
            put(Sheep.class.getName(), 70);
            put(Boar.class.getName(), 50);
            put(Buffalo.class.getName(), 20);
            put(Duck.class.getName(), 10);
        }});
        put(Eagle.class.getName(), new HashMap<>() {{
            put(Fox.class.getName(), 10);
            put(Rabbit.class.getName(), 90);
            put(Mouse.class.getName(), 90);
            put(Duck.class.getName(), 80);
        }});

        put(Horse.class.getName(), new HashMap<>() {{
            put(Grass.class.getName(), 100);
        }});
        put(Horse.class.getName(), new HashMap<>() {{
            put(Grass.class.getName(), 100);
        }});
        put(Rabbit.class.getName(), new HashMap<>() {{
            put(Grass.class.getName(), 100);
        }});
        put(Rabbit.class.getName(), new HashMap<>() {{
            put(Grass.class.getName(), 100);
        }});
        put(Mouse.class.getName(), new HashMap<>() {{
            put(Grass.class.getName(), 100);
            put(Caterpillar.class.getName(), 90);
        }});
        put(Goat.class.getName(), new HashMap<>() {{
            put(Grass.class.getName(), 100);
        }});
        put(Sheep.class.getName(), new HashMap<>() {{
            put(Grass.class.getName(), 100);
        }});
        put(Boar.class.getName(), new HashMap<>() {{
            put(Mouse.class.getName(), 50);
            put(Caterpillar.class.getName(), 90);
        }});
        put(Buffalo.class.getName(), new HashMap<>() {{
            put(Grass.class.getName(), 100);
        }});
        put(Duck.class.getName(), new HashMap<>() {{
            put(Grass.class.getName(), 100);
            put(Caterpillar.class.getName(), 90);
        }});
        put(Caterpillar.class.getName(), new HashMap<>() {{
            put(Grass.class.getName(), 100);
        }});
    }};

    public static HashMap<String, HashMap<String, Integer>> getConfig() {
        return chanceToBeEatenConfig;
    }
}
