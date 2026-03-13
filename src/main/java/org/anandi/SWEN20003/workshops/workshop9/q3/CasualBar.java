package org.anandi.SWEN20003.workshops.workshop9.q3;

import java.util.HashMap;
import java.util.Map;

public class CasualBar extends Bar {

    @Override
    public Map<String, Double> getMenu() {
        Map<String, Double> menu = new HashMap<>();
        menu.put("Orange juice", 1.00);
        menu.put("Water", 0.00);
        menu.put("Lemon juice", 2.00);
        return menu;
    }
}
