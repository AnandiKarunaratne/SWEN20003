package org.anandi.SWEN20003.workshops.workshop9.q3;

import org.anandi.SWEN20003.workshops.workshop9.q2.DefaultDisountStrategy;
import org.anandi.SWEN20003.workshops.workshop9.q2.DiscountStrategy;

import java.util.HashMap;
import java.util.Map;

public abstract class Bar {
    private final Map<String, Double> menu;
    private final Map<String, DiscountStrategy> people = new HashMap<>();

    public Bar() {
        menu = getMenu();
    }

    public abstract Map<String, Double> getMenu();

    public double getPrice(String customer, String drink) {
        if (menu.containsKey(drink)) {
            return people.getOrDefault(customer, new DefaultDisountStrategy()).applyDiscount(menu.get(drink));
        } else {
            return 0;
        }
    }

}
