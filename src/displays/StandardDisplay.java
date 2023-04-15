package displays;

public abstract class StandardDisplay implements Display {

	private double inches;
	protected String features = null;
	
	public StandardDisplay(double inches) {
		this.inches = inches;
	}
	
	public double getInches() {
		return inches;
	}

	public abstract void assemble( ); // diagonalSize of display
	
}
