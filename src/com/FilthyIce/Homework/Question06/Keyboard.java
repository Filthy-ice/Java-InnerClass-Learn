package com.FilthyIce.Homework.Question06;

public class Keyboard implements USBConnect,USBDisconnect{
    @Override
    public void connect() {
        System.out.println("键盘链接了");
    }

    @Override
    public void disconnect() {
        System.out.println("键盘断开了");
    }
}
