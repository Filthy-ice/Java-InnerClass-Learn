package com.FilthyIce.InnerLearn02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入:> ");
        String s = sc.next();
        sendMassage(str->{
            char[] cArr = str.toCharArray();
            System.out.print("|");
            for (int i = 0; i < cArr.length; i++) {
                if(i != cArr.length-1){
                    System.out.print(cArr[i]+"|");
                }else{
                    System.out.print(cArr[i]);
                }
            }
            System.out.println("|");
        },s);
    }
    public static void sendMassage(StringHandler s,String str){
        s.massage(str);
    }
}
