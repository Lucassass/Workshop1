package src.main.java.com.mycompany.buildingsandsensors;

import java.util.UUID;

public class Unit {
    private String name;
    private UUID id;

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

