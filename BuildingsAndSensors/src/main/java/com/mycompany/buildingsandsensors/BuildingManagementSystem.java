package src.main.java.com.mycompany.buildingsandsensors;

import java.util.ArrayList;
import java.util.UUID;

public class BuildingManagementSystem extends Building {
    public BuildingManagementSystem(String name, ArrayList<Building> buildings) {
        super(name);
        this.buildings = buildings;
    }

    private ArrayList<Building> buildings = new ArrayList();

    public ArrayList<Building> getBuilding() {

        return buildings;
    }

    public UUID addBuilding(String name) {
        Building newbuildings = new  Building(name);
        buildings.add(newbuildings);
        return newbuildings.getId();
    }
    public void removeBuilding(Unit UUID) {
        buildings.remove(UUID);
    }
}

