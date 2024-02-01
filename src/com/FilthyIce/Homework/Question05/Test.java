package com.FilthyIce.Homework.Question05;

public class Test {
    public static void main(String[] args) {
        join(new Player() {
            @Override
            public void playBasketball() {
                System.out.println("小罗: 蓝蝶划云游身步");
            }

            @Override
            public void playFootball() {
                System.out.println("国足!RNM!退钱!!!");
            }

            @Override
            public void playVolleyball() {
                System.out.println("排球:所有球类中接广告最多队伍");
            }
        });
    }
    public static void join(Player p){
        p.playBasketball();
        p.playFootball();
        p.playVolleyball();
    }
}
