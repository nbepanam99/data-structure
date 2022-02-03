package fundamental.design.patterns.creational.factory.abstracts;

import fundamental.design.patterns.creational.factory.abstracts.bank.Bank;
import fundamental.design.patterns.creational.factory.abstracts.loan.BusinessLoan;
import fundamental.design.patterns.creational.factory.abstracts.loan.HomeLoan;
import fundamental.design.patterns.creational.factory.abstracts.loan.Loan;

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