package com.builder;

public class Application {

    public static void main(String[] args) {
        House house = new HouseBuilder()
                .buildWalls(4)
                .buildDoors(1)
                .buildRoof()
                .buildWindows(4)
                .getResult();
    }

}
