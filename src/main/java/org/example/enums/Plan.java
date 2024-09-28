package org.example.enums;

public enum Plan {
    BASIC("BASIC",4000),
    ECO("ECO", 3500),
    SUPER("SUPER",6000);


    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
