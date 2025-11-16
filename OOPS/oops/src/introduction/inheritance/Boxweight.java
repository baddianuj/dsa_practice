package introduction.inheritance;

public class Boxweight extends Box{
    double weight;

    Boxweight(){
        this.weight = -1;
    }

    public Boxweight(double l, double weight) {
        super(l);
        this.weight = weight;
    }
}
