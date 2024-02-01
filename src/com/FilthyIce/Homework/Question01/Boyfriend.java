package com.FilthyIce.Homework.Question01;

public class Boyfriend extends Person{
    public Boyfriend() {
    }

    public Boyfriend(String name, double height) {
        super(name, height);
    }

    public void getMoney(){
        System.out.println(getName()+"挣钱中...");
    }
    public void shopping(Girlfriend girl){
        System.out.println(getName()+"正在和"+girl.getName()+"一起逛街");
    }
}
