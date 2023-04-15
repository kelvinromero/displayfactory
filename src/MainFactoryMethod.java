import displays.Display;
import factory.method.*;

public class MainFactoryMethod {

    public static void main(String args[]) {
        DisplayFactory factory = null;
        Display display = null;

        factory = new SmartphoneDisplayFactory();
        display = factory.create(6.1);
        System.out.println(display);

        factory = new TabletDisplayFactory();
        display = factory.create(10.2);
        System.out.println(display);


        factory = new FoldableSmartphoneDisplayFactory();
        display = factory.create(new double[]{6.7, 6.2});
        System.out.println(display);
    }

}