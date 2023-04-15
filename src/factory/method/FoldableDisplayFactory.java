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
        qualityTest(display);
        return display;
    }

    @Override
    public void qualityTest(Display display) {
        System.out.print("Teste de Qualidade: ");
        for (int i = 1; i < 4; i++) {
            System.out.print(  "[*] ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" OK (passed)");
    }

    // Metodo de fabrica
    protected abstract FoldableDisplay createDisplay(double d, double d2);
}
