
package openclosed.principle;

public class OpenClosedPrinciple {
    public interface PaymentProcessor {
        public void prossPayment(double amount);
    }
    public static class CreditCardPaymentProcessor implements PaymentProcessor{
        @Override
        public void prossPayment(double amount) {
            System.out.println("Processing credit card payment of $" + amount);
        }
    }
    public static class PayPalPaymentProcessor implements PaymentProcessor{

        @Override
        public void prossPayment(double amount) {
            System.out.println("Processing PayPal payment of $"+amount);
        }
        
    }
    public static class PaymentService {
    public static void processPayment(PaymentProcessor processor,double amount)
    {
        processor.prossPayment(amount);
    }

}
    public static void main(String[] args) {
        CreditCardPaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        PayPalPaymentProcessor payPalProcessor = new PayPalPaymentProcessor();
        PaymentService.processPayment(creditCardProcessor,100);
        PaymentService.processPayment(payPalProcessor, 200);
    }
    
}
