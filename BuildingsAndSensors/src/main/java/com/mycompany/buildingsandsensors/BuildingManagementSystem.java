package src.main.java.com.mycompany.buildingsandsensors;

import java.util.ArrayList;
import java.util.UUID;

public class BuildingManagementSystem {
    private ArrayList building = new ArrayList(Building);

    public ArrayList getBuilding() {
        return building;
    }

    private addBuilding(String name) {
        return this.building.add();
    }

    private removeBuilding(String name){
        return this.building.remove();
    }
}

