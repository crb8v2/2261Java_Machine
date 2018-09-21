public class Smartphone extends Machine {

    private double defWeight = 0.3;
    private double defPrice = 200;

    public Smartphone() {}

    public void setPrice(double p){

        if(p < 220 || p > 350)
            price = defPrice;
        else
            price = p;
    }


    public void setWeight(double w){

        if(w <= .25 || w >= .5)
            weight = defWeight;
        else
            weight = w;
    }
}
