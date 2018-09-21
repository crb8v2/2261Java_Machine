public class Scan extends Machine {

    private double defPrice = 80;
    private double defWeight = 10;

    public Scan(){}

    public void setPrice(double p){

        if(p < 60 || p > 300)
            price = defPrice;
        else
            price = p;
    }


    public void setWeight(double w){

        if(w < 2 || w > 25)
            weight = defWeight;
        else
            weight = w;
    }
}
