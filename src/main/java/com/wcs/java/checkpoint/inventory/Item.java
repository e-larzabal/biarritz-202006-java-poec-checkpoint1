package com.wcs.java.checkpoint.inventory;

public interface Item {
    ItemType getType();
    String getDescription();
    String getBonusDescription();
    int getIntelligenceBonus();
    int getAgilityBonus();
    int getStrengthBonus();
    int getResistanceBonus();
}
