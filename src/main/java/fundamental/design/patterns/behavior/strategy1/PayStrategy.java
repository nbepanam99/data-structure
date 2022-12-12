package fundamental.design.patterns.behavior.strategy1;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
