package factory.method;

import displays.StandardDisplay;

import java.util.concurrent.TimeUnit;

public abstract class StandardDisplayFactory implements DisplayFactory {

	public StandardDisplay create(double inches) {
		// Metodo gancho
		StandardDisplay display = createDisplay(inches);
		display.assemble();
		qualityTest(display);
		return display;
	}

	public StandardDisplay create(double[] inches) {
		return null;
	}

	public void qualityTest( StandardDisplay display ) {
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

	protected abstract StandardDisplay createDisplay(double d);
}