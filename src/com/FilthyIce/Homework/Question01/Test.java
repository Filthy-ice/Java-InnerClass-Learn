package com.FilthyIce.Homework.Question01;

public class Test {

    public static void main(String[] args) {
        Girlfriend girl = new Girlfriend("凤姐",175);
        Boyfriend boy = new Boyfriend("王校长",180);
        girl.cooking();
        girl.washClothes(new Clothes("abidas",Color.粉色));
        boy.getMoney();
        boy.shopping(girl);
    }
}
