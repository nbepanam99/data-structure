package fundamental.design.patterns.creational.factory.abstracts;

import fundamental.design.patterns.creational.factory.abstracts.bank.Bank;
import fundamental.design.patterns.creational.factory.abstracts.loan.Loan;

abstract class AbstractFactory{
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
