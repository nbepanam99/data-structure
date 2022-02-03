package fundamental.design.patterns.creational.factory.abstracts.bank;

import fundamental.design.patterns.creational.factory.abstracts.bank.Bank;

public class HDFC implements Bank {
    private final String BNAME;
    public HDFC(){
        BNAME="HDFC BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}