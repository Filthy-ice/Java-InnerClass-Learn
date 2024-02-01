package com.FilthyIce.Homework.Question06;

public class Test {
    public static void main(String[] args) {
        // 方法二
        Computer computer = new Computer();
        computer.Start(()-> System.out.println("鼠标链接了"));
        computer.Start(()-> System.out.println("键盘链接了"));
        System.out.println();
        computer.Close(()-> System.out.println("键盘断开了"));
        computer.Close(()-> System.out.println("鼠标断开了"));
        System.out.println();
        System.out.println();
        // 方法一
        ComputerCopy computerCopy = new ComputerCopy();
        Mouse mouse = new Mouse();
        Keyboard keyboard =new Keyboard();
        computerCopy.start(mouse,keyboard);
        System.out.println();
        computerCopy.close(mouse,keyboard);
    }
}
