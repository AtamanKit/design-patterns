package com.nonSingleton;

public class Cars {
    private String maid;

    public Cars(String maid) {
        this.maid = maid;
    }
    
    public void color() {
        if (maid == "Mazda") {
            System.out.println("Red");
        } else if (maid == "BMW") {
            System.out.println("Black");
        } else if (maid == "Audi") {
            System.out.println("White");
        }
    }
}
