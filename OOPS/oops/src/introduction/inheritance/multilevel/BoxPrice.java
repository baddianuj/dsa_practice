package introduction.inheritance.multilevel;

public class BoxPrice extends Boxweight{
    double cost;

    public BoxPrice() {
        this(1,2,3,4,5);
    }

    public BoxPrice(double l, double w, double h, double weight, double cost) {
        super(l, weight);
        this.cost = cost;
    }
}
