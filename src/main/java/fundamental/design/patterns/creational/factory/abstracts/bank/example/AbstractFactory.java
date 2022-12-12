package fundamental.design.patterns.creational.factory.abstracts.bank.example;

import fundamental.design.patterns.creational.factory.abstracts.bank.example.bank.Bank;
import fundamental.design.patterns.creational.factory.abstracts.bank.example.loan.Loan;

abstract class AbstractFactory{
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
