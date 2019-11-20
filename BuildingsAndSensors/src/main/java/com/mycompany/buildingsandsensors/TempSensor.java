package src.main.java.com.mycompany.buildingsandsensors;

import javax.xml.crypto.Data;

public class TempSensor extends Sensor implements Data {
    @Override
    public void getTemp() {
        return;
    }
    @Override
    public String toString() {
        return "TempSensor{}";
    }
}
