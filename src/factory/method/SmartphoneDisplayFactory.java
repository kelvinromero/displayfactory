package factory.method;

import displays.Display;
import displays.SmartphoneDisplay;
import displays.StandardDisplay;

public class SmartphoneDisplayFactory extends StandardDisplayFactory {

    @Override
    protected StandardDisplay createDisplay(double inches) {
        return new SmartphoneDisplay(inches);
    }
}