public abstract class Machine {
    protected String name; //protected
    protected double price;
    protected double weight;
    protected String description;

    public Machine(){}

    //getters // only need set weight and price
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public double getWeight(){
        return weight;
    }
    public String getDescription(){
        return description;
    }

    //setters
    public void setName(String n){
        name = n;
    }
    public void setDescriptions(String d){
        description =  d;
    }

    public abstract void setWeight(double i);
    public abstract void setPrice(double j);
} // class





