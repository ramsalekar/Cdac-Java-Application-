package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("*************** Hello to Fruit Basket Application ***************");


        Fruit[] basket = new Fruit[10];
        int counter = 0;
        int remain = 10;
        Scanner sc = new Scanner(System.in);

        boolean start = true;
        while(start){
            System.out.println();
            System.out.println("Enter the choose : ");
            System.out.println("1 : add Mango , 2 : add Orange , 3 : add Apple , 4 : check Stale fruit , 5 : check : taste , 6 : check Application of your Fruit , 7 : Display Items , 0 : Exit" );
            System.out.println();
            System.out.println("Basket Remaing capacity : "+remain);
            System.out.println();
            int c = sc.nextInt();

            switch(c){
                case 1 : {
                    System.out.println("Give the details your need Fruit : ");
                    System.out.println(" Name : ");
                    String name = sc.next();
                    System.out.println(" Colour : ");
                    String colour =sc.next();
                    System.out.println(" weight : ");
                    int weight = sc.nextInt();
                    System.out.println(" price : ");
                    int price = sc.nextInt();
                    System.out.println(" Freshness : ");
                    boolean freshness = sc.nextBoolean();

                    basket[counter++]=new Mango(name,colour,price,weight,freshness);
                    remain--;
                    break;

                }
                case 2 : {
                    System.out.println("Give the details your need Fruit : ");
                    System.out.println(" Name : ");
                    String name = sc.next();
                    System.out.println(" Colour : ");
                    String colour =sc.next();
                    System.out.println(" weight : ");
                    int weight = sc.nextInt();
                    System.out.println(" price : ");
                    int price = sc.nextInt();
                    System.out.println(" Freshness : ");
                    boolean freshness = sc.nextBoolean();

                    basket[counter++]=new Orange(name,colour,price,weight,freshness);
                    remain--;
                    break;

                }
                case 3 :  {
                    System.out.println("Give the details your need Fruit : ");
                    System.out.println(" Name : ");
                    String name = sc.next();
                    System.out.println(" Colour : ");
                    String colour =sc.next();
                    System.out.println(" weight : ");
                    int weight = sc.nextInt();
                    System.out.println(" price : ");
                    int price = sc.nextInt();
                    System.out.println(" Freshness : ");
                    boolean freshness = sc.nextBoolean();

                    basket[counter++]=new Apple(name,colour,price,weight,freshness);
                    remain--;
                    break;

                }
                case 4 : {
                    for(int a=0; a<counter;a++){
                        if(!basket[a].isFresh()){
                            System.out.println(basket[a].toString());
                        }

                    }

                 break;
                }
                case 5 : {
                    System.out.println("*** The taste of all fruit in your basket Most Likely **** ");
                    for(int a=0; a<counter; a++){
                        System.out.print(basket[a].getName()+" ");
                        basket[a].taste();
                    }
                    break;
                }
                case 6 : {
                    System.out.println("*** The Application  of all fruit in your basket Most Likely **** ");
                    for (int a=0;a<counter;a++){
                        if(basket[a] instanceof Mango){
                            Mango m = (Mango)basket[a];
                            m.pulp();
                        }
                        else if (basket[a] instanceof Orange){
                            Orange o = (Orange) basket[a];
                            o.juice();
                        }
                        else{
                            Apple x= (Apple)basket[a];
                            x.jam();
                        }
                    }


                    break;
                }

                case 7 : {
                    System.out.println("Details of Basket ");
                    for (int a=0;a<counter;a++){
                        System.out.println(basket[a].getName() + " "+basket[a].getColour());

                    }
                    break;
                }
                case 0 : {
                    start=false;
                    System.out.println("Thanks for shopping ");
                }
            }




        }

    }

}