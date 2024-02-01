package com.FilthyIce.InnerLearn03;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        useNumHandler(()-> new Random().nextInt(100));
    }
    public static void useNumHandler(NumHandler nh){
        int num = nh.getNum();
        System.out.println("随机数:"+num);
    }
}
