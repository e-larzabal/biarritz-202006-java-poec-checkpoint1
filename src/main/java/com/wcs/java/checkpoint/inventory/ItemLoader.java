package com.wcs.java.checkpoint.inventory;

import java.util.ArrayList;
import java.util.List;

public class ItemLoader {
    public static List<Item> items = new ArrayList<>();
    static {
        initItems();
    }

    public static void initItems() {

        items.add(new Boots("Light Elfic Boots", 0, 2, 0, 1));

        // todo - create here new instances of your items
        items.add(new Armor("sword", 1, 2, 3, 4));
        items.add(new Ring("magic ring", 5, 2, 3, 1));
    }

    public static List<Item> loadAllGameItems() {
        return items;
    }
}
