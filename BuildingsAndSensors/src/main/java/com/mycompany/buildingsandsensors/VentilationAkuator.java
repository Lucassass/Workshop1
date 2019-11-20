package src.main.java.com.mycompany.buildingsandsensors;

public class VentilationAkuator extends Akuator {

    public VentilationAkuator(String name, double value) {
        super(name, value);
    }
    @Override
    public double setValue(double value) {
        return super.setValue(value);
    }

    @Override
    public String toString() {
        return "VentilationAkuator{}";
    }
}