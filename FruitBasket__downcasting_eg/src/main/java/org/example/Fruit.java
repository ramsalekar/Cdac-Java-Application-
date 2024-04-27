package org.example;

public abstract class  Fruit {

    private String  name,colour;
    private int weight,price;

    private boolean fresh;

    Fruit(String name,String colour,int weight,int price,boolean fresh){
        this.colour=colour;
        this.name=name;
        this.weight=weight;
        this.price=price;
        this.fresh=fresh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }

    public abstract void  taste();
}
