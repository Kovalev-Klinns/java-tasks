public class Chocolate extends Candy {
    public Chocolate(Double weight, int sugarContent) {
        super(weight, sugarContent);
    }
    String nameOfSweet = "Chocolate";
    @Override
    public String toString() {
        return nameOfSweet + " (Weight - " + getWeight() + ", Sugar content - " + getSugarContent() + ")";
    }
}
