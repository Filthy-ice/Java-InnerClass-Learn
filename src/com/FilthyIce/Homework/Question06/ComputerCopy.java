package com.FilthyIce.Homework.Question06;

public class ComputerCopy {
    public void start(Mouse m,Keyboard k){
        m.connect();
        k.connect();
    }
    public void close(Mouse m,Keyboard k){
        m.disconnect();
        k.disconnect();
    }
}
