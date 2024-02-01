package com.FilthyIce.Homework.Question04;

public class Father {
    private String name = "张三";
    class Child{
        public void introFather(){
            System.out.println(Father.this.name);
        }
    }
}
