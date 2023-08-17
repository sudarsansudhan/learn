package inheritance;

public class BoxPrices extends BoxWeight{
    double cost;

    public BoxPrices() {
        super();
        this.cost=-1;
    }
    BoxPrices(BoxPrices other){
        super(other);
        this.cost=other.cost;

    }

    public BoxPrices(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }
}
