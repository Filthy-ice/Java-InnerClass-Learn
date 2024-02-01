package com.FilthyIce.InnerLearn04;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入三个整数进行乘法运算:> ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        useIMath(((a,b,c)-> a*b*c),x,y,z);
        System.out.print("输入三个整数进行加法运算:> ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        useIMath(((a,b,c)-> a+b+c),x,y,z);
        System.out.print("输入三个整数进行减法运算:> ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        useIMath(((a,b,c)-> a-b-c),x,y,z);
        System.out.print("输入三个整数进行除法运算:> ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        useIMath(((a,b,c)-> a/b/c),x,y,z);
    }
    public static void useIMath(IMath iM,int x,int y,int z){
        int num = iM.calc(x,y,z);
        System.out.println("结果为:> "+num);
    }
}
