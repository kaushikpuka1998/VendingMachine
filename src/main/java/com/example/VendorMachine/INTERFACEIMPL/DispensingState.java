package com.example.VendorMachine.INTERFACEIMPL;

import com.example.VendorMachine.ENTITIES.Coin;
import com.example.VendorMachine.ENTITIES.Item;
import com.example.VendorMachine.ENTITIES.VendingMachine;

import java.util.List;

public class DispensingState implements State{

    DispensingState(VendingMachine vendingMachine, int ProductCode) throws Exception {
        System.out.println("State == Dispensing product");
        dispenseProduct(vendingMachine, ProductCode);
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {

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
        Item item = machine.getInventory().get(codeNumber);
        if(item.getQuantity() > 0){
            item.setQuantity(item.getQuantity()-1);
            machine.setState(new IdleState(machine));
            return item;
        }
        else{
            throw new Exception("Product is out of stock");
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        return 0;
    }

    @Override
    public List<Coin> refundMoney(VendingMachine machine) throws Exception {
        throw new Exception("Cannot refund money in dispensing state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {

    }
}
