package factory.method;

import displays.Display;
import displays.FoldableDisplay;

import java.util.concurrent.TimeUnit;

public abstract class FoldableDisplayFactory implements DisplayFactory {

    public FoldableDisplay create(double d) {
        return null;
    }
    public FoldableDisplay create(double[] inches) {
        FoldableDisplay display = createDisplay(inches[0], inches[1]);
        display.assemble();
        return display;
    }

    @Override
    public void qualityTest(Display display) {
        System.out.println("Testando qualidade do display");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Display OK");
    }

    // Metodo de fabrica
    protected abstract FoldableDisplay createDisplay(double d, double d2);
}
