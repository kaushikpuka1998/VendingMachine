package com.example.VendorMachine.INTERFACEIMPL;

import com.example.VendorMachine.ENTITIES.Coin;
import com.example.VendorMachine.ENTITIES.Item;
import com.example.VendorMachine.ENTITIES.VendingMachine;

import java.util.List;

public class SelectionState implements State{
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
        Item item = machine.getInventory().get(code);
        List<Coin> coins = machine.getCoinInventory();
        double paidByUser = coins.stream().mapToDouble(Coin::getValue).sum();
        if(paidByUser < item.getPrice()){
            refundMoney(machine);
            throw new Exception("Insufficient money");
        }
        if(item.getQuantity() > 0){
            machine.setState(new DispensingState(machine, code));
        }
        else{
            throw new Exception("Product is out of stock");
        }
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        return null;
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        return returnChangeMoney;
    }

    @Override
    public List<Coin> refundMoney(VendingMachine machine) throws Exception {
        return machine.getCoinInventory();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {

    }
}
