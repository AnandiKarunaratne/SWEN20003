package org.anandi.SWEN20003.workshops.workshop9.q2;

public class RelativeDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.01;
    }
}
