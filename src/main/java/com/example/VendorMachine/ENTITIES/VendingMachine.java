package com.example.VendorMachine.ENTITIES;

import com.example.VendorMachine.INTERFACEIMPL.State;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class VendingMachine {
    private State state;
    private Map<Integer, Item> inventory;
    private List<Coin> coinInventory;
}
