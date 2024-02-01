package com.FilthyIce.InnerLearn05;

public class Test {
    public static void main(String[] args) {
        useIConverter(Integer::parseInt);
        useIConverter(String::length);
    }
    public static void useIConverter(IConverter iConverter){
        int value = iConverter.convert("6666");
        System.out.println(value);
    }
}
