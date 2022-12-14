package design_patterns.creational.factory.abstracts.bank.example;

import design_patterns.creational.factory.abstracts.bank.example.bank.Bank;
import design_patterns.creational.factory.abstracts.bank.example.loan.Loan;

abstract class AbstractFactory{
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
