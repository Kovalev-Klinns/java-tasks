public class Lollipop extends Candy {
    public Lollipop(Double weight, int sugarContent) {
        super(weight, sugarContent);
    }
    String nameOfSweet = "Lollipop";
    @Override
    public String toString() {
        return nameOfSweet + " (Weight - " + getWeight() + ", Sugar content - " + getSugarContent() + ")";
    }
}

