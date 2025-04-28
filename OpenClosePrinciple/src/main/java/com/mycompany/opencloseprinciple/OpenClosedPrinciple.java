
package com.mycompany.opencloseprinciple;
public class OpenClosedPrinciple {
    public interface PaymentProcessor {
        public String processPayment(double amount);
    }
    public static class CreditCardPaymentProcessor implements PaymentProcessor{
        @Override
        public String processPayment(double amount) {
           return "Processing credit card payment of $" + amount;
        }
    }
    public static class PayPalPaymentProcessor implements PaymentProcessor{

        @Override
        public String processPayment(double amount) {
            return "Processing PayPal payment of $"+amount;
        }
        
    }
    public static class PaymentService {
    public static void processPayment(PaymentProcessor processor,double amount)
    {
    System.out.println(processor.processPayment(amount));
    }

}
    public static void main(String[] args) {
        CreditCardPaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        PayPalPaymentProcessor payPalProcessor = new PayPalPaymentProcessor();
        PaymentService.processPayment(creditCardProcessor,100);
        PaymentService.processPayment(payPalProcessor, 200);
    }
    
}
    

