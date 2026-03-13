package org.anandi.SWEN20003.workshops.workshop9.q2;

import java.util.HashMap;
import java.util.Map;

public abstract class Bar {
    private final Map<String, Double> menu;
    private final Map<String, DiscountStrategy> people = new HashMap<>();

    public Bar() {
//        menu.put("Orange juice", 1.00);
//        menu.put("Water", 0.00);
//        menu.put("Lemon juice", 2.00);
        menu = getMenu();

        people.put("Alice", new RelativeDiscountStrategy());
        people.put("Bob", new MemberDiscountStrategy());
    }

    public abstract Map<String, Double> getMenu();

    public double getPrice(String customer, String drink) {
        if (menu.containsKey(drink)) {
            return people.getOrDefault(customer, new DefaultDisountStrategy()).
                    applyDiscount(menu.get(drink));
        } else {
            return 0;
        }
    }
}
