package com.factory;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("It delivered by ship");
    }

}
