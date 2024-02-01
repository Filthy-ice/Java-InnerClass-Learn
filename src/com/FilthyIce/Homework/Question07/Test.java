package com.FilthyIce.Homework.Question07;

public class Test {
    public static void main(String[] args) {
        useDirctor(()-> System.out.println("导演拍电影了"));
    }
    public static void useDirctor(Director d){
        d.makeMovie();
    }
}
