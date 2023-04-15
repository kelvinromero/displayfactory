package displays;

public class FoldableSmartphoneDisplay extends FoldableDisplay {

        public FoldableSmartphoneDisplay(double diagonalSize, double diagonalSize2) {
            super(diagonalSize, diagonalSize2);
        }

        @Override
        public void assemble() {
            System.out.println("Montando display para SMARTPHONE DOBRAVEL");
            features = getInches() + "\" Foldable Smartphone Display";
        }

        @Override
        public String toString() {
            return features;
        }
}
