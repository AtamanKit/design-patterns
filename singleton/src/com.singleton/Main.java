package com.singleton;

public class Main {
    public static void main(String[] args) {
        var car = Cars.getInstance("Mazda");
        car.color();
    }
}