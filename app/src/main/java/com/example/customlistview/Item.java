package com.example.customlistview;

public class Item {

    private final int imageResId;
    private final String text;

    public Item(int imageResId, String text) {
        this.imageResId = imageResId;
        this.text = text;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getText() {
        return text;
    }
}
