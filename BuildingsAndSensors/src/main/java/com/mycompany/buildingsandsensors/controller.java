package src.main.java.com.mycompany.buildingsandsensors;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class controller implements Initializable {
    BuildingManagementSystem bms;

    @FXML
    public void showAllBuildings(ActionEvent actionEvent) {
        System.out.println(this.bms.getBuilding());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.bms = new BuildingManagementSystem("1", new ArrayList<Building>());
    }
}
