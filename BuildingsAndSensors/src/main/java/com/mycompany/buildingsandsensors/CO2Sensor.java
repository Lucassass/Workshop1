package src.main.java.com.mycompany.buildingsandsensors;

import javax.xml.crypto.Data;

public class CO2Sensor extends Sensor implements Data {
    public CO2Sensor(String name) {
        super(name);
    }

    @Override
    public void getCo2() {
        return;
    }
    @Override
    public String toString() {
        return "CO2Sensor{}";
    }
}
