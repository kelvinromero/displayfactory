package displays;

public class TabletDisplay extends StandardDisplay {
	
	public TabletDisplay(double inches) {
		super(inches);
	}
	
    @Override
    public void assemble() {
    	System.out.println("Montando o display de um TABLET");
    	features = getInches() + "\" Liquid Retina Display 2388 x 1668 pixels resolution for iPad PRO Antireflective";
    }
    
	public String toString() {
		return features;
	}
}
