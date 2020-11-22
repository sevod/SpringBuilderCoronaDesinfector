package com.sevod;

public class Main {
    public static void main(String[] args) {
        CoronaDisinfector disinfector = new CoronaDisinfector();
        disinfector.start(new Room());
    }
}
