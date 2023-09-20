package com.example.st200373088labweek2;

public class Mobile {
    private String brand;
    private String model;
    private int storage;

    public Mobile(String brand, String model, int storage) {
        if (storage <= 0) {
            throw new IllegalArgumentException("Storage must be greater than 0");
        }
        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Storage: " + storage + "GB";
    }

    // Invalid Argument Test
    public static void main(String[] args) {
        // Valid
        try {
            Mobile phone1 = new Mobile("Apple", "iPhone 15", 128);
            System.out.println(phone1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Invalid
        try {
            Mobile phone2 = new Mobile("Apple", "iPhone 8", 0);
            System.out.println(phone2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
