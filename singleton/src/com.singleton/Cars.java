package com.singleton;

public class Cars {
    private static Cars instance;
    private String made;

    private Cars(String made) {
        this.made = made;
    }

    public static Cars getInstance(String made) {
        if (instance == null) {
            instance = new Cars(made);
        }
        return instance;
    }

    public void color() {
        if (made.equals("Mazda")) {
            System.out.println("Red");
        } else if (made.equals("Toyota")) {
            System.out.println("Blue");
        } else if (made.equals("Honda")) {
            System.out.println("Green");
        }
    }
}