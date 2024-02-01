package com.FilthyIce.Homework.Question02;

public class Test {
    public static void main(String[] args) {
        Employee e = new Employee() {
            @Override
            public void work() {
                System.out.println("工号为: "+getId()+"的员工"+getName()+"正在努力的敲代码.");
            }
            @Override
            public String toString(){
                return "传说中的 "+getId()+" !"+getName();
            };
        };
        e.setId("007");
        e.setName("星爷");
        e.work();
        System.out.println(e);
    }

}
