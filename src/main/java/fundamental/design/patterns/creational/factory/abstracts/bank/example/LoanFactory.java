package fundamental.design.patterns.creational.factory.abstracts.bank.example;

import fundamental.design.patterns.creational.factory.abstracts.bank.example.bank.Bank;
import fundamental.design.patterns.creational.factory.abstracts.bank.example.loan.Loan;
import fundamental.design.patterns.creational.factory.abstracts.bank.example.loan.BusinessLoan;
import fundamental.design.patterns.creational.factory.abstracts.bank.example.loan.HomeLoan;

public class LoanFactory extends AbstractFactory{
    public Bank getBank(String bank){
        return null;
    }

    public Loan getLoan(String loan){
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Business")){
            return new BusinessLoan();
        }
        return null;
    }

}