package org.anandi.SWEN20003.workshops.workshop6.q2;

public class AuctionBid implements Comparable<AuctionBid> {

    private String name;
    private String itemName;
    private int amount;

    public AuctionBid(String name, String itemName, int amount) {
        this.name = name;
        this.itemName = itemName;
        this.amount = amount;
    }


    @Override
    public int compareTo(AuctionBid other) {
        int result = name.compareTo(other.name);
        if (result != 0) {
            return result;
        }
        result = itemName.compareTo(other.itemName);
        if (result != 0) {
            return result;
        }
        return amount - other.amount;
    }
}
