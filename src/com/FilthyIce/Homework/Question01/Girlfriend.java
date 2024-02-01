package com.FilthyIce.Homework.Question01;

public class Girlfriend extends Person{
    public Girlfriend() {
    }

    public Girlfriend(String name, double height) {
        super(name, height);
    }

    public void cooking(){
        System.out.println(getName()+"做饭ing...");
    }

    public void washClothes(Clothes clothe){
        System.out.println(getName()+"正在洗那件"+clothe.getColor()+"的"+clothe.getBrand());
    }
}
