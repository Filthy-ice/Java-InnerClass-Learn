package com.FilthyIce.Homework.Question06;

public class Computer{
    public void Start(USBConnect c){
        c.connect();
    }
    public void Close(USBDisconnect d){
        d.disconnect();
    }
}
