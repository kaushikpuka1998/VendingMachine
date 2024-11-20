package com.example.VendorMachine.INTERFACEIMPL;

import com.example.VendorMachine.ENTITIES.Coin;
import com.example.VendorMachine.ENTITIES.Item;
import com.example.VendorMachine.ENTITIES.VendingMachine;

import java.util.List;

public class HasMoneyState implements State{

    HasMoneyState() {
        System.out.println("State == Has Money State");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        machine.getCoinInventory().add(coin);
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
        machine.setState(new IdleState(machine));
        return machine.getCoinInventory();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {

    }
}
