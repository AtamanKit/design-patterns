package com.nonSingleton;

public class Main {
    public static void main(String[] args) {
        var carMazda = new Cars("Mazda");
        var carBMW = new Cars("BMW");
        var carAudi = new Cars("Audi");
        
        carMazda.color();
        carBMW.color();
        carAudi.color();
    }
}
