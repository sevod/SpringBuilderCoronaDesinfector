package com.sevod;

public class RecommendatorImpl implements Recommendator {

    @InjectProperty
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("to protect from COVID-2019, drink " + alcohol);
    }
}
