public class Printer extends Machine {

    private double defWeight = 25;
    private double defPrice = 90;

    public Printer(){}

    public void setPrice(double p){

        if(p < 40 || p > 200)
            price = defPrice;
        else
            price = p;
    }


    public void setWeight(double w){

        if(w > 50 || w == 0)
            weight = defWeight;
        else
            weight = w;
    }
}