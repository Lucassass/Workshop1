/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.main.java.com.mycompany.buildingsandsensors;

import java.util.ArrayList;
import java.util.UUID;


public class Building extends Unit {
    private ArrayList<Sensor> sensors = new ArrayList();
    private ArrayList<Akuator> akuators = new ArrayList();

    public Building(String name) {
        super(name);
    }

    public ArrayList<src.main.java.com.mycompany.buildingsandsensors.Sensor> getSensor() {
        return sensors;
    }

    public ArrayList<Akuator> getAkuator() {
        return akuators;
    }

    public UUID addTemperaturSensor(String name) {
        TempSensor newsSnsor = new TempSensor(name);
        sensors.add(newsSnsor);
        return newsSnsor.getId();
    }

    public UUID addCO2Sensor(String name){
        CO2Sensor newco2 = new CO2Sensor(name);
        sensors.add(newco2);
        return newco2.getId();
    }

    public void removeSensor(Unit UUID) {
        sensors.remove(UUID);
        }

    public UUID addVentAkuator(String name){
        Akuator newakuator = new Akuator(name,2.0);
        akuators.add(newakuator);
        return newakuator.getId();
    }
    public void removeAkuator(Unit UUID){
        akuators.remove(UUID);
    }
}

