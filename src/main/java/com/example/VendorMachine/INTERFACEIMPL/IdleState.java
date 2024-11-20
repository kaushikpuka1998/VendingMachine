package com.example.VendorMachine.INTERFACEIMPL;

import com.example.VendorMachine.ENTITIES.Coin;
import com.example.VendorMachine.ENTITIES.Item;
import com.example.VendorMachine.ENTITIES.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{

    IdleState(VendingMachine machine) {
        System.out.println("State == Idle State");
        machine.setCoinInventory(new ArrayList<>());
    }


    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {

    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {

    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        return null;
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        return 0;
    }

    @Override
    public List<Coin> refundMoney(VendingMachine machine) throws Exception {
        return List.of();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {

    }
}
