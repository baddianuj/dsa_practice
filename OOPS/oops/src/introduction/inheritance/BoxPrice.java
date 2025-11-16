package introduction.inheritance;

public class BoxPrice extends Boxweight{
    double cost;

    public BoxPrice() {
        this(1,2,3,4,5);
    }

    public BoxPrice(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }
}
