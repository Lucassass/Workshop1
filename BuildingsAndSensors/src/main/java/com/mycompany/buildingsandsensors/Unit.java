package src.main.java.com.mycompany.buildingsandsensors;

import java.util.Random;
import java.util.UUID;

public class Unit {
    private String name;
    private UUID id;
    private Random random = new Random();

    public Unit(String name) {
        this.name = name;
        this.id = new UUID(random.nextLong(), random.nextLong());
    }

    public Random getRandom() {
        return random;
    }

    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

