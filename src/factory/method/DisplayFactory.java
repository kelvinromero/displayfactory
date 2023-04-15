package factory.method;

import displays.Display;

public interface DisplayFactory {
    public Display create(double inches);

    public Display create(double[] inches);

    public default void qualityTest(Display display) {
    }
}
