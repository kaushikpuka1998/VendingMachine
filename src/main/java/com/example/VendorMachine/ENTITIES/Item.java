package com.example.VendorMachine.ENTITIES;

import lombok.Data;

@Data
public class Item {
    private String id;
    private String name;
    private double price;
    private ItemType type;
    private int quantity;
}
