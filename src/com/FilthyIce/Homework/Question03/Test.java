package com.FilthyIce.Homework.Question03;

public class Test {
    public static void main(String[] args) {
        enter(new Sport() {
            @Override
            public void run() {
                System.out.println("参加运动会,奔跑吧");
            }
        });
        enter(()-> System.out.println("参加运动会,奔跑吧"));
    }
    public static void enter(Sport s){
        s.run();
    }
}
