package displays;

public abstract class FoldableDisplay implements Display {
    protected double diagonalSize;
    protected double diagonalSize2;
    protected String features;
    protected Boolean isFolded;

    public FoldableDisplay(double diagonalSize, double diagonalSize2) {
        this.diagonalSize = diagonalSize;
        this.diagonalSize2 = diagonalSize2;
        this.isFolded = false;
    }

    public void fold() {
        this.isFolded = true;
    }

    public void unfold() {
        this.isFolded = false;
    }

    public String toString() {
        return features;
    }

    public double getInches() {
        return isFolded ? diagonalSize2 : diagonalSize;
    }

    public abstract void assemble();
}