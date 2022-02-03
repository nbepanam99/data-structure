package fundamental.design.patterns.creational.factory.abstracts;

import fundamental.design.patterns.creational.factory.abstracts.bank.Bank;
import fundamental.design.patterns.creational.factory.abstracts.bank.HDFC;
import fundamental.design.patterns.creational.factory.abstracts.bank.SBI;
import fundamental.design.patterns.creational.factory.abstracts.loan.Loan;

public class BankFactory extends AbstractFactory{
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}