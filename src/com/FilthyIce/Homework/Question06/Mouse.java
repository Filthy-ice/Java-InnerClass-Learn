package com.FilthyIce.Homework.Question06;

public class Mouse implements USBConnect,USBDisconnect{
    @Override
    public void connect() {
        System.out.println("鼠标连接了");
    }

    @Override
    public void disconnect() {
        System.out.println("鼠标断开了");
    }
}
