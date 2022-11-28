package com.example.atm2.Modely;

import com.example.atm2.Nahled.Nahled;

public class Modely {
    private static Modely modely;
    private final Nahled nahled;
    private Modely() {
        this.nahled = new Nahled();
    }
    public static synchronized Modely getInstance() {
        if(modely == null) {
            modely = new Modely();
        }
        return modely;
    }
    public Nahled getNahled() {
        return nahled;
    }
}