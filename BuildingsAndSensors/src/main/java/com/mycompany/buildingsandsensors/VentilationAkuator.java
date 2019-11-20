package src.main.java.com.mycompany.buildingsandsensors;

public class VentilationAkuator extends Akuator {
    double value;

    public VentilationAkuator(double akuator) {
        super(akuator);
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "VentilationAkuator{" +
                "value=" + value +
                '}';
    }
}
