package com.FilthyIce.InnerLearn01;

public class Test {
    public static void main(String[] args) {
        feed(() -> System.out.println("吃烤鸭"));
    }

    public static void feed(Animal a){
        a.eat();
    }
}
