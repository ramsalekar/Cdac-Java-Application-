package org.example;

public class Orange extends Fruit{

    Orange(String name,String colour,int price,int weight,boolean fresh){
        super(name, colour, weight, price,fresh);

    }

    public void taste(){
        System.out.println("Sour");
    }
    public void juice(){
        System.out.println(this.getName()+" is very good juice making");
    }

    @Override
    public String toString() {
        return this.getName()+" "+this.getColour()+" "+this.isFresh();
    }
}
