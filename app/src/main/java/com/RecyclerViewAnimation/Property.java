package com.RecyclerViewAnimation;

import java.util.ArrayList;

public class Property {

    private int type = 0;
    private ArrayList<String> images = new ArrayList<>();
    private String sellerIcon;
    private String address;
    private String content;
    private long price;
    private int area;
    private double rooms;
    private int parking = 0;
    private boolean balcony = false;

    public Property() {}

    public int getType() {
        return type;
    }

    public Property setType(int type) {
        this.type = type;
        return this;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public Property setImages(ArrayList<String> images) {
        this.images = images;
        return this;
    }

    public Property addImage(String image) {
        this.images.add(image);
        return this;
    }

    public String getSellerIcon() {
        return sellerIcon;
    }

    public Property setSellerIcon(String sellerIcon) {
        this.sellerIcon = sellerIcon;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Property setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Property setContent(String content) {
        this.content = content;
        return this;
    }

    public long getPrice() {
        return price;
    }

    public Property setPrice(long price) {
        this.price = price;
        return this;
    }

    public int getArea() {
        return area;
    }

    public Property setArea(int area) {
        this.area = area;
        return this;
    }

    public double getRooms() {
        return rooms;
    }

    public Property setRooms(double rooms) {
        this.rooms = rooms;
        return this;
    }

    public int getParking() {
        return parking;
    }

    public Property setParking(int parking) {
        this.parking = parking;
        return this;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public Property setBalcony(boolean balcony) {
        this.balcony = balcony;
        return this;
    }
}
