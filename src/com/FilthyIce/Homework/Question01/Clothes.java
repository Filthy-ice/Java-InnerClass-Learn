package com.FilthyIce.Homework.Question01;

import java.awt.*;

enum Color{
    白色,
    黑色,
    粉色,
    蓝色,
    黄色,
    带图案
}


public class Clothes {
    private String brand;
    private Color color;

    public Clothes(String brand, Color color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
