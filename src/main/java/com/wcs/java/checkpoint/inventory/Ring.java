package com.wcs.java.checkpoint.inventory;

public class Ring implements Item {

    private int intelligence;
    private int agility;
    private int strength;
    private int resistance;
    private String description;

    public Ring(String description, int intelligence, int agility, int strength, int resistance) {
        this.intelligence = intelligence;
        this.agility = agility;
        this.strength = strength;
        this.resistance = resistance;
        this.description = description;
    }

    @Override
    public ItemType getType() { return ItemType.RING; }

    @Override
    public String getDescription() { return this.description; }

    @Override
    public String getBonusDescription() {
        return "INT=" + this.intelligence + " AGI=" + this.agility + " STR=" + this.strength + " RES=" + this.resistance;
    }

    @Override
    public int getIntelligenceBonus() { return this.intelligence; }

    @Override
    public int getAgilityBonus()  {
        return this.agility;
    }

    @Override
    public int getStrengthBonus() {
        return strength;
    }

    @Override
    public int getResistanceBonus() {
        return resistance;
    }
}
