package com.builder;

public class HouseBuilder {

    private House house;

    public HouseBuilder() {
        house = new House();
    }

    public HouseBuilder buildWalls(int walls) {
        house.setWalls(walls);
        return this;
    }

    public HouseBuilder buildDoors(int doors) {
        house.setDoors(doors);
        return this;
    }

    public HouseBuilder buildWindows(int windows) {
        house.setWalls(windows);
        return this;
    }

    public HouseBuilder buildRoof() {
        house.setHasRoof(true);
        return this;
    }

    public HouseBuilder buildGarage() {
        house.setHasGarage(true);
        return this;
    }

    public House getResult() {
        return house;
    }

}
