package src.main.java.com.mycompany.buildingsandsensors;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class controller implements Initializable {
    private BuildingManagementSystem bms;

   @FXML
    public void showAllBuildings(ActionEvent actionEvent) {
       System.out.println(bms.getBuilding());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
