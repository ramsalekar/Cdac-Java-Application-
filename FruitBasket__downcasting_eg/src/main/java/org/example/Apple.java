package org.example;

public class Apple  extends  Fruit{
    Apple(String name,String colour,int price,int weight,boolean fresh){
        super(name, colour, weight, price,fresh);

    }

    public void taste(){
        System.out.println("Sweet and Sour");
    }
    public void jam(){
        System.out.println(this.getName()+" is  good for delicious jam making");
    }

    @Override
    public String toString() {
        return this.getName()+" "+this.getColour()+" "+this.isFresh();
    }
}
