package com.builder;

public class House {

    private int walls;
    private int doors;
    private int windows;
    private boolean hasRoof;
    private boolean hasGarage;

    public int getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public boolean hasRoof() {
        return hasRoof;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

}
