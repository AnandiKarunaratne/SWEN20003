package org.anandi.SWEN20003.workshops.workshop9.q2;

public class DefaultDisountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price;
    }
}
