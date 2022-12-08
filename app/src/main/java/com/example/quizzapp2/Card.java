package com.example.quizzapp2;

public class Card {
    private int img;
    private String name;

    public Card(int img, String name) {
        this.img = img;
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }
}
