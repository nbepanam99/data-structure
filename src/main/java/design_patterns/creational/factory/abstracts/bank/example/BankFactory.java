package design_patterns.creational.factory.abstracts.bank.example;

import design_patterns.creational.factory.abstracts.bank.example.bank.Bank;
import design_patterns.creational.factory.abstracts.bank.example.bank.HDFC;
import design_patterns.creational.factory.abstracts.bank.example.bank.SBI;
import design_patterns.creational.factory.abstracts.bank.example.loan.Loan;

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