package com.factory;

public class Application {

    public static void main(String[] args) {
        String deliveryMethod = args[0];
        Logistics logistics;
        if(deliveryMethod.equals("road")) {
            logistics = new RoadLogistics();
        } else {
            logistics = new SeaLogistics();
        }
        logistics.planDelivery();
    }

}
