package src.main.java.com.mycompany.buildingsandsensors;

import java.util.ArrayList;
import java.util.UUID;

public class BuildingManagementSystem {
    private ArrayList building = new ArrayList(Building);

    public ArrayList getBuilding() {
        return building;
    }

    public addBuilding(String name) {
        return this.building.add();
    }

    public removeBuilding(String name){
        return this.building.remove();
    }
}

