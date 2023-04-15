package factory.method;

import displays.Display;
import displays.FoldableDisplay;
import displays.FoldableSmartphoneDisplay;

public class FoldableSmartphoneDisplayFactory extends FoldableDisplayFactory {

    @Override
    protected FoldableDisplay createDisplay(double d, double d2) {
        return new FoldableSmartphoneDisplay(d, d2);
    }
}
