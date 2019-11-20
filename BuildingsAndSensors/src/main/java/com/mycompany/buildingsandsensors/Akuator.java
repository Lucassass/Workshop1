/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.main.java.com.mycompany.buildingsandsensors;

public class Akuator extends Unit {
    // Same as sensor, maybe a double or String

    public Akuator(String name, double value) {
        super(name);
        this.value = value;
    }

    private double value;

    public double setValue(double value){
        return this.value;
    }
    public double getValue() {
        return value;
    }
}