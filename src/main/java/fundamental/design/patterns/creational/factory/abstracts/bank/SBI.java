package fundamental.design.patterns.creational.factory.abstracts.bank;

import fundamental.design.patterns.creational.factory.abstracts.bank.Bank;

public class SBI implements Bank {
    private final String BNAME;
    public SBI(){
        BNAME="SBI BANK";
    }
    public String getBankName(){
        return BNAME;
    }
}