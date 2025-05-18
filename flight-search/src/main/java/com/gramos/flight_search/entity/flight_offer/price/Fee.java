package com.gramos.flight_search.entity.flight_offer.price;

public class Fee {
    private String amount;
    private String type;

    public Fee(String amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
