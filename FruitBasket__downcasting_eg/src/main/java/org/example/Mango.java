package org.example;

public class Mango extends Fruit{

    Mango(String name,String colour,int price,int weight,boolean fresh){
        super(name, colour, weight, price,fresh);

    }
    public void taste(){
        System.out.println("Sweet");
    }
    public void pulp(){
        System.out.println(this.getName()+" mango have very good pulp");
    }

    @Override
    public String toString() {
        return this.getName()+" "+this.getColour()+" "+this.isFresh();
    }
}
