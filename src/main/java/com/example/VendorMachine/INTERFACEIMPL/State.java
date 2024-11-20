package com.example.VendorMachine.INTERFACEIMPL;

import com.example.VendorMachine.ENTITIES.Coin;
import com.example.VendorMachine.ENTITIES.Item;
import com.example.VendorMachine.ENTITIES.VendingMachine;

import java.util.List;

public interface State {
    void clickOnInsertCoinButton(VendingMachine machine) throws Exception;
    void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;
    void insertCoin(VendingMachine machine, Coin coin) throws Exception;
    void chooseProduct(VendingMachine machine, int code) throws Exception;
    Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;
    int getChange(int returnChangeMoney) throws Exception;
    public List<Coin> refundMoney(VendingMachine machine) throws Exception;
    void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;
}
