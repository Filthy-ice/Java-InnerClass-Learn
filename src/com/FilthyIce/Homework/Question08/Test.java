package com.FilthyIce.Homework.Question08;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入相减的两个数:> ");
        int x = sc.nextInt(), y=sc.nextInt();
        // 调用计算方法
        invokeCalc(x,y,(a,b)->a-b);
    }
    public static void invokeCalc(int a,int b,Calculator c){
        int result = c.calc(a,b);
        System.out.println(a+"-"+b+"="+result);
    }
}
