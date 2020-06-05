package com.wcs.java.checkpoint.inventory;

abstract class AbstractItem {

    private int intelligence;
    private int agility;
    private int strength;
    private int resistance;
    private String description;

    public AbstractItem(String description, int intelligence, int agility, int strength, int resistance) {
        this.intelligence = intelligence;
        this.agility = agility;
        this.strength = strength;
        this.resistance = resistance;
        this.description = description;
    }
}
