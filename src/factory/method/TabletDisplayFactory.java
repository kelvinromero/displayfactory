package factory.method;

import displays.Display;
import displays.StandardDisplay;
import displays.TabletDisplay;

public class TabletDisplayFactory extends StandardDisplayFactory {

    @Override
    protected StandardDisplay createDisplay(double inches) {
        return new TabletDisplay(inches);
    }
}
